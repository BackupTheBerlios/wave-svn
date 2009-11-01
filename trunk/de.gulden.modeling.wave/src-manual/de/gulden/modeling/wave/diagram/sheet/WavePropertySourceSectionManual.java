/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.diagram.sheet;

import org.eclipse.emf.ecore.EObject;
//import org.eclipse.php.internal.ui.editor.PHPSourceViewer;
//import org.eclipse.php.internal.ui.editor.PHPSourceViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TextChangeListener;
import org.eclipse.swt.custom.TextChangedEvent;
import org.eclipse.swt.custom.TextChangingEvent;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import de.gulden.modeling.wave.Action;
import de.gulden.modeling.wave.Include;
import de.gulden.modeling.wave.Operation;
import de.gulden.modeling.wave.StyleSheet;
import de.gulden.modeling.wave.View;
import de.gulden.modeling.wave.diagram.sheet.sourceViewerAdapter.AbstractSourceViewerAdapter;
import de.gulden.modeling.wave.diagram.sheet.sourceViewerAdapter.PHPSourceViewerAdapter;
import de.gulden.modeling.wave.diagram.sheet.sourceViewerAdapter.TextSourceViewerAdapter;
import de.gulden.modeling.wave.impl.OperationImpl;
import de.gulden.modeling.wave.util.WaveUtil;

public class WavePropertySourceSectionManual extends WavePropertySourceSection {
	
	protected Form form;
	//protected Text text;
	//protected PHPSourceViewer text;
	protected AbstractSourceViewerAdapter text;	

	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
		super.page = new PropertySheetPage(); // dummy to avoid nullpointers in superclass
		
		//parent.setLayout(new FillLayout());
		
		FormToolkit toolkit = tabbedPropertySheetPage.getWidgetFactory();
		
		form = toolkit.createForm(parent);
		form.setText("initializing...");
		
		form.getBody().setLayout(new FillLayout());
		
		//text = createSourceViewer(toolkit, form); // TODO user config which language
		text = new PHPSourceViewerAdapter();
		if ( ! text.isAvailable()) {
			text = new TextSourceViewerAdapter();
		}
		text.init(toolkit, form);

		text.addTextChangeListener(new TextChangeListener() {
			//@Override
			public void textChanged(TextChangedEvent event) {
				EObject o = getEObject();
				String s = text.getText();
				try {
					if (o instanceof Operation) {
						((Operation)o).setCode(s);
						//text.applyStyles(); // ???
					} else if (o instanceof Action) {
						((Action)o).getOperation().setCode(s);
					} else if (o instanceof View) {
						((View)o).getOperation().setCode(s);
					} else if (o instanceof Include) {
						((Include)o).setCode(s);
					} else if (o instanceof StyleSheet) {
						((StyleSheet)o).setCode(s);
					}
				} catch (IllegalStateException ise) {
					// TODO
					WaveUtil.warnWorkaroundMissingWriteTransaction();
				}
			}
			//@Override
			public void textChanging(TextChangingEvent event) {
				// nop
			}
			//@Override
			public void textSet(TextChangedEvent event) {
				// nop
			}
		});		
		
		//Font headfont = new Font(Display.getCurrent(), "Courier", 12, SWT.BOLD); 
		Font font = new Font(Display.getCurrent(), "Courier", 12, SWT.NONE);
		//form.setFont(headfont);
		text.setFont(font);
		
		form.getBody().addControlListener(new ControlListener() {
			public void controlMoved(ControlEvent e) {
				// nop
			}
			public void controlResized(ControlEvent e) {
				Point size = form.getBody().getSize();
				text.setSize(size);
			}
		});
		
		/*text.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
				// nop
			}
			public void keyReleased(KeyEvent e) {
				textHasChanged();
			}
		});*/
		
	}
	
	/*private void textHasChanged() {
		// simple update gui->model on every key-press (not costy, sets pointer only)
		EObject o = getEObject();
		String s = text.getText();
		if (o instanceof Operation) {
			((Operation)o).setCode(s);
			//text.applyStyles(); // ???
		} else if (o instanceof Action) {
			((Action)o).getOperation().setCode(s);
		} else if (o instanceof View) {
			((View)o).getOperation().setCode(s);
		} else if (o instanceof Include) {
			((Include)o).setCode(s);
		} else if (o instanceof StyleSheet) {
			((StyleSheet)o).setCode(s);
		}
	}*/

	@Override
	public void refresh() {
		if (text != null) {
			EObject o = getEObject();
			String sig = WaveUtil.getSourceEditorTitle(o);
			form.setText(sig);
			String code;
			if (o instanceof Operation) {
				code = ((Operation)o).getCode();
				code = WaveUtil.normalizeCode(code);
			} else if (o instanceof Include) {
				code = ((Include)o).getCode();
			} else if (o instanceof StyleSheet) {
				code = ((StyleSheet)o).getCode();
			} else if (o instanceof Action) {
				code = ((Action)o).getOperation().getCode();
				code = WaveUtil.normalizeCode(code);
			} else if (o instanceof View) {
				code = ((View)o).getOperation().getCode();
			} else {
				return;
			}
			text.setText(WaveUtil.noNull(code));
		}
	}

}
