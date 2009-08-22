<h4 class='install'>Get via SVN</h4>

<div class='install'>
Currently, you may download and run WAVE via SVN:
<ol>
	<li>
		Install an <b>Eclipse 3.4 Ganymede Modeling Tools</b> distribution package 
		(e.g. from here: <a href='http://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/ganymede/SR2/eclipse-modeling-ganymede-SR2-incubation-win32.zip'>Windows</a> / 
		<a href='http://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/ganymede/SR2/eclipse-modeling-ganymede-SR2-incubation-linux-gtk.tar.gz'>Linux</a>).
		Galileo releases may not work yet.
	</li>
	<li>
		Start Eclipse and install an <b>SVN client plugin</b>, e.g. <a href='http://subclipse.tigris.org/' target='_blank'>Subclipse</a>, as described 
		<a href='http://subclipse.tigris.org/servlets/ProjectProcess?pageID=p4wYuA' target='_blank'>here</a>.
	</li>
	<li>
		Restart Eclipse, open the SVN Repository Exploring perspective, add the <b>repository</b> 
		<pre>
		svn://svn.berlios.de/wave/
		</pre>
		and <b>check out</b>
		<pre>
		trunk/de.gulden.modeling.wave
		</pre> 
		as a project into the workspace.
		The first build after checking out the project will fail, because additionally required packages (openArchitectureWare and PHP Development Tools) are still missing.
	</li>
	<li>
		Install the <b>openArchitectureWare</b> plugins from <a href='http://www.openarchitectureware.org/staticpages/index.php/download?menu=Download' target='_blank'>here</a>. 
	</li>
	<li>
		Install the <b>PHP Development Tools (PDT)</b> plugins as described <a href='http://wiki.eclipse.org/PDT/Installation#Eclipse_3.4_.2F_Ganymede_.2F_PDT_1.0.5.2B' target='_blank'>here</a>. 
		Make sure to follow the instructions for the Ganymede 3.4 release, according to the initially chosen Modeling Tools distribution package.
	</li>
	<li>
		Compilation errors should all disappear now. If not, invoke "Project/Clean.../Clean all projects", or restart Eclipse with the "-clean" option. (Bugs have been reported that the PDT component requires regular re-initialization using this option.)   
	</li>
	<li>
		<b>Start the WAVE development</b> environment by invoking a second Eclipse instance through "Right-click on project de.gulden.modeling.wave / Run As... / Eclipse Application".
		This second instance of Eclipse will have the WAVE plugins installed as regular extension plugins.  
	</li>
	<li>
		In the second workspace, create a general project of your choice. Right-click on the project's name and choose "New / Other... / Web-Application Visual Environment (WAVE) / Wave Diagram".
		<b>Create a model</b> according to the <a href='?page=doc'>documentation</a> of the WAVE modeling language. 
		Start the <b>code-generation process</b> with the button on the right of the zoom-widget in the toolbar, or by right-clicking on the diagram plane and choosing "Run Code Generation".
	</li>
</ol>
</div>
