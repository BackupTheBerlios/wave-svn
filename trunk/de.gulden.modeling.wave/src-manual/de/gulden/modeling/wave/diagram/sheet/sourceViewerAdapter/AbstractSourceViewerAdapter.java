package de.gulden.modeling.wave.diagram.sheet.sourceViewerAdapter;

import org.eclipse.swt.custom.TextChangeListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;

public abstract class AbstractSourceViewerAdapter {
	
	FormToolkit toolkit;
	Form form;
	protected Control control;
	
	public void init(FormToolkit toolkit, Form form) {
		this.toolkit = toolkit;
		this.form = form;
		this.createControl();
	}
	
	/*public Control getControl() {
		return control;
	}*/
	
	abstract protected void createControl(); 

	abstract public String getText();
	
	abstract public void setText(String s);
	
	abstract public void addTextChangeListener(TextChangeListener l);
	
	abstract public boolean isAvailable();

	public void setFont(Font font) {
		control.setFont(font);
	}

	public void setSize(Point size) {
		control.setSize(size);
	}
	
}
