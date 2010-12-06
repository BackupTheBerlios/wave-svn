/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.action;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.eclipse.core.internal.localstore.FileSystemResourceManager;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowContextDefaultImpl;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.emf.mwe.utils.Reader;
import org.eclipse.emf.transaction.impl.ResourceSetManager;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditDomain;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.DiagramDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDiagramDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocumentProvider;
import org.eclipse.gmf.runtime.emf.core.internal.util.MetamodelManager;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.internal.xtend.expression.ast.SyntaxElement;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.internal.EditorPluginAction;
import org.eclipse.ui.internal.handlers.CommandLegacyActionWrapper;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xpand2.Generator;
import org.eclipse.xtend.expression.ExceptionHandler;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;
import org.eclipse.xtend.util.stdlib.GlobalVarExtensions;

//import runtime.WaveRuntimeLoader;

import de.gulden.modeling.wave.Model;
import de.gulden.modeling.wave.WavePackage;
import de.gulden.modeling.wave.diagram.edit.parts.ModelEditPart;
import de.gulden.modeling.wave.diagram.part.WaveDiagramEditor;
import de.gulden.modeling.wave.impl.ModelImpl;
import de.gulden.modeling.wave.presentation.WaveEditor;

public class RunCodeGenerationAction implements IObjectActionDelegate, IEditorActionDelegate {
	
	/**
	 * Call from command-line. 
	 * Usage: java RunCodegenerationAction <model-file> [<source-folder>]
	 * The optional <source-folder> parameter overwrites the Source Folder
	 * attribute in the model file.  
	 */
	public static void main(String[] args) {
		if (args.length >= 1) {
			RunCodeGenerationAction a = new RunCodeGenerationAction();
			a.modelFilename = args[0]; // model filename
			if (args.length >= 2) {
				a.outputFolder = args[1]; // output folder
				if (args.length >= 3) {
					a.invoke = args[2]; // invokation mode (generator | roundtrip)
				}
			}
			a.run(null);
		} else {
			System.err.println("error: no model file specified");
			System.exit(1);
		}
	}
	
	// -----------------------------------------------------------------------

	protected IEditorPart editorPart;
	protected Model model;
	protected String modelFilename;
	protected String outputFolder;
	protected URI runtimeURI;
	protected String invoke; // "generator" | "roundtrip"
	
	/**
	 * Constructor
	 */
	public RunCodeGenerationAction() {
		super();
		init();
	}
	
	protected void init() {
		this.editorPart = null;
		this.model = null;
		this.modelFilename = null;
		this.outputFolder = null;
		this.invoke = "generator"; // or "roundtrip"
	}
	
	//@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		updateConfiguration(targetPart);
	}

	//@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// nop, we care for the whole model only
	}
	
	//@Override
	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
		if (targetEditor != null) {
			updateConfiguration(targetEditor);
		}
	}
	
	protected void updateConfiguration(IWorkbenchPart targetPart) {
		if (targetPart instanceof WaveDiagramEditor) {
			WaveDiagramEditor editor = (WaveDiagramEditor)targetPart;
			this.editorPart = editor;
			DiagramImpl doc = (DiagramImpl)editor.getDiagramDocument().getContent();
			this.model  = (Model)doc.getElement();
			//this.editorPart = ((DiagramEditDomain)editor.getDiagramEditDomain()).getEditorPart();
		} else if (targetPart instanceof WaveEditor) {
			WaveEditor editor = (WaveEditor)targetPart;
			this.editorPart = editor;
			TreeViewer viewer = (TreeViewer)editor.getViewer();
			if (viewer != null) {
				//TreeViewer viewer = (TreeViewer)((WaveEditor)this.editorPart).getViewer();
				ResourceSetImpl input = (ResourceSetImpl)viewer.getInput(); 
				//AdapterFactoryContentProvider provider = (AdapterFactoryContentProvider)viewer.getContentProvider();
				XMIResourceImpl xmiResource = (XMIResourceImpl)input.getResources().get(0);
				Object o = xmiResource.getContents().get(0);
				this.model  = (Model)o;
			} else {
				init();
				return;
			}
		} else {
			init();
			return;
		}
		
		FileEditorInput input = ((FileEditorInput) editorPart.getEditorInput() ); 
		IPath path = input.getPath();
		this.modelFilename = path.toString();
		if (this.modelFilename.endsWith("_diagram")) {
			this.modelFilename = this.modelFilename.substring(0, this.modelFilename.length()-8); // TODO hack, remove "_diagram" to get model file
		}
		this.outputFolder = null; // force refresh
	}
	
	//@Override
	public void run(IAction action) {
		if (invoke.equals("generator")) {
			runGenerator();
		} else if (invoke.equals("roundtrip")) {
			runRoundtrip();
		}
	}
	
	protected void runGenerator() {
		//System.out.println("Code generation starting.");
		saveEditor(); // save model file before code-generation
		WorkflowContextDefaultImpl context = new WorkflowContextDefaultImpl();
		if ((this.editorPart instanceof WaveEditor) || (this.editorPart instanceof WaveDiagramEditor) /*&& (this.model == null)*/) { // workaround for deferred invokation
			updateConfiguration(this.editorPart);
		}
		URI modelURI = URI.createFileURI(modelFilename);
		generateCode(context, (this.model == null) ? modelURI : null);
		System.out.println("Code generation done.");
	}
	
	protected void runRoundtrip() {
		System.out.println("Roundtrip starting.");
		WorkflowContextDefaultImpl context = new WorkflowContextDefaultImpl();
		if ((this.editorPart instanceof WaveEditor) && (this.model == null)) { // workaround for deferred invokation
			updateConfiguration(this.editorPart);
		}
		URI modelURI = URI.createFileURI(modelFilename);
		//assert this.invoke.equals("roundtrip");
		generateCode(context, (this.model == null) ? modelURI : null); // roundtrip mode
		
		// saveEditor();
		
		if (this.editorPart instanceof WaveEditor) {
			// workaround for missing Command mechanism: force save on non-diagram editor
			saveEditor(); // TODO record if any changes and ask user if should be saved
			//WaveEditor editor = (WaveEditor)this.editorPart;
			//((BasicCommandStack)editor.getEditingDomain().getCommandStack()). //isSaveNeeded();
			//editor.isDirty();
		}
		
		/*
		// TODO - must be activated if called off-line via command-line
		// save in-memory instance of model
		try {
			saveModel(model, modelURI);
		} catch (IOException ioe) {
			System.out.println("Error while saving roundtrip changes to model: ");
			ioe.printStackTrace();
		}
		
		// refresh Eclipse editors
		*/
		
		System.out.println("Roundtrip done.");
	}
	
	/**
	 * Also used for roundtrip, depending on this.invoke.
	 * 
	 * @param context
	 * @param modelURI
	 * @return in-memory instance of model
	 */
	protected void generateCode(WorkflowContext context, URI modelURI) {
		
		EmfMetaModel metaModel = new EmfMetaModel();
		metaModel.setUseSingleGlobalResourceSet(true);
		metaModel.setMetaModelPackage(WavePackage.class.getName());
		
		Issues issues = new IssuesImpl();
		
		ExceptionHandler exceptionHandler = new ExceptionHandler() {

			@Override
			public void handleRuntimeException(RuntimeException ex,
					SyntaxElement element, ExecutionContext ctx,
					Map<String, Object> additionalContextInfo) {
				System.err.println(ex.getMessage()); // TODO Eclipse error / Issues
				ex.printStackTrace();
			}
			
		};
		
		if (modelURI != null) { // not given from active editor, load from file
			Reader reader = new Reader();
			//reader.setUseSingleGlobalResourceSet(true);
			reader.setModelSlot("model");
			String s = modelURI.toString();
			reader.setUri(s);
			reader.invoke(context, new NullProgressMonitor(), issues);
			this.model = (Model)context.get("model");
		} else {
			context.set("model", this.model);
		}
		
		if (outputFolder == null) {
			//outputFolder = (String)model.eGet(WavePackage.MODEL__SOURCE_FOLDER, true, true);
			outputFolder = model.getSourceFolder();
			outputFolder = outputFolder.replace('/', File.separatorChar); // backslashes on Windows
			if (outputFolder.startsWith(File.separator)) { // consider absolute, but use own implementation on windows to find drive letter relative to model file
				File modelFile = new File(modelFilename);
				String d = modelFile.getAbsolutePath();
				if (!d.startsWith(File.separator)) {
					d = d.substring(0, 2); // drive letter
					outputFolder = d + outputFolder;
				}
			}
		}
		
		// output-folder
		File folder = null;
		if (outputFolder != null) {
			folder = new File(outputFolder);
			if ( (! folder.isAbsolute()) ) { // relative to model-file's parent folder
				folder = new File(modelFilename);
				folder = new File(folder, "../"+outputFolder);
			}
		}
		
		String outputPath = null;
		try {
			if ( folder == null ) {
				throw new IOException();
			}
			outputPath = folder.getCanonicalPath();
			folder = new File(outputPath); // fix, otherwise folder.exists() will return false in Linux
			if ( ( ! folder.exists() ) || ( ! folder.isDirectory() ) ) {
				throw new IOException();
			}
		} catch (IOException ioe) {
			System.err.println("error generating code: invalid source folder " + outputFolder); // TODO eclipse-error-dialog
			return; // IRREGULAR EXIT
		}
		
		String xpandCommand = "generator::main::"+invoke+" FOR model";
		
		System.out.println("Code generation starting, output to " + outputPath + " invoking '" + xpandCommand + "'");
		
		GlobalVarExtensions.storeGlobalVar("outputPath", outputPath);
		
		String currentDate = (new SimpleDateFormat( "yyyy-MM-dd HH:mm" )).format(new Date()); // HH:mm:ss.S
		GlobalVarExtensions.storeGlobalVar("currentDate", currentDate);
		
		// TODO run constraint-check

		/*URL url;
		try {
		        url = new URL("platform:/plugin/de.gulden.modeling.wave/generator/main.xpt");
		    InputStream inputStream = url.openConnection().getInputStream();
		    BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
		    String inputLine;
		 
		    while ((inputLine = in.readLine()) != null) {
		        System.out.println(inputLine);
		    }
		 
		    in.close();
		 
		} catch (IOException e) {
		    e.printStackTrace();
		}*/
		
		Generator g = new Generator();
		g.setFileEncoding("ISO-8859-1");
		//g.setFileEncoding("UTF-8");
		g.addMetaModel(metaModel);
		g.setGenPath( outputPath ); // TODO use Outlet
		//g.setExpand("main::"+invoke+" FOR model"); 
		g.setExpand(xpandCommand); // TODO Find out why it is necessary to preprend 
//															  // "generator::" source folder name.
//															  // Unlike call via MWE-script, and unlike in earlier
//															  // versions of MWE/OAW, classpath settings seem not
//															  // to have effect here.
		g.setExceptionHandler(exceptionHandler);
		g.invoke(context, new NullProgressMonitor(), issues);
	}		

	/**
	 * Invokes "save" operation on Eclipse diagram editor. 
	 */
	private void saveEditor() {
		if (this.editorPart != null) {
			if (this.editorPart.isDirty()) {
				this.editorPart.doSave(new org.eclipse.core.runtime.NullProgressMonitor());
			}
		}
	}
	
	/**
	 * Saves an in-memory model to a file.
	 * 
	 * @param model
	 * @param uri
	 * @throws IOException
	 */
	private void saveModel(Model model, URI uri) throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("codedoc", new XMIResourceFactoryImpl());
		Resource resource = resourceSet.createResource(uri);
		if (resource == null) {
			throw new IOException("URI "+uri+" is invalid");
		}
		resource.getContents().add(model);
		// options defined on org.eclipse.emf.ecore.xmi.XMIResource
		resource.save(null);
	}
	
	
}
