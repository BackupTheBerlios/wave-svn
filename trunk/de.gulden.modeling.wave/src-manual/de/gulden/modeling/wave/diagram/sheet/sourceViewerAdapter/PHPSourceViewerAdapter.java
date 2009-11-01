package de.gulden.modeling.wave.diagram.sheet.sourceViewerAdapter;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.custom.TextChangeListener;
import org.eclipse.swt.custom.TextChangedEvent;
import org.eclipse.swt.custom.TextChangingEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;

import de.gulden.modeling.wave.Action;
import de.gulden.modeling.wave.Include;
import de.gulden.modeling.wave.Operation;
import de.gulden.modeling.wave.StyleSheet;
import de.gulden.modeling.wave.View;
import de.gulden.modeling.wave.util.WaveUtil;

/**
 * No static compiler reference to PHPSourceViewer.
 * Will adapt to PHPSourceViewer if class reference can be dynamically resolved.
 * Optional dependency plugin "org.eclipse.php.ui".
 * @author Jens Gulden
 */
public class PHPSourceViewerAdapter extends AbstractSourceViewerAdapter {
	
	protected Class clas;
	protected Method methodSetText;
	protected Method methodGetText;
	protected Method methodGetTextWidget;
	//protected Method methodSetFont;
	//protected Method methodSetSize;
	
	public PHPSourceViewerAdapter() {
		try {
			clas = Class.forName("org.eclipse.php.internal.ui.editor.PHPSourceViewer");
		} catch (Throwable th) {
			clas = null;
		}
	}

	protected void createControl() {
		try {
			Constructor constr = clas.getConstructor(new Class[] { Composite.class, int.class });
			Object viewer = constr.newInstance(new Object[] { this.form.getBody(), 0 });
			this.control = (Control)viewer;
			methodSetText = clas.getMethod("setText", new Class[] { String.class });
			methodGetText = clas.getMethod("getText", new Class[] { });
			methodGetTextWidget = clas.getMethod("getTextWidget", new Class[] { });
			//methodSetFont = clas.getMethod("setFont", new Class[] { Font.class });
			//methodSetSize = clas.getMethod("setSize", new Class[] { Point.class });
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public void setText(String s) {
		try {
			methodSetText.invoke(this.control, s);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public String getText() {
		String s;
		try {
			s = (String)methodGetText.invoke(this.control);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return s;
	}
	
	public void addTextChangeListener(TextChangeListener l) {
		try {
			StyledText text = (StyledText)methodGetTextWidget.invoke(this.control, new Object[]{});
			text.getContent().addTextChangeListener(l);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public boolean isAvailable() {
		return (clas != null);
	}
	
	/*public void setFont(Font f) {
		try {
			methodSetFont.invoke(this.control, f);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public void setSize(Point s) {
		try {
			methodSetSize.invoke(this.control, s);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}*/
	
}
