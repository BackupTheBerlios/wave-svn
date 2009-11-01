package de.gulden.modeling.wave.diagram.sheet.sourceViewerAdapter;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TextChangeListener;
import org.eclipse.swt.custom.TextChangedEvent;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Text;

public class TextSourceViewerAdapter extends AbstractSourceViewerAdapter {

	@Override
	protected void createControl() {
		Text text = toolkit.createText(form.getBody(), "initializing...", SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		this.control = text;
		text.setTabs(4);
	}

	@Override
	public void addTextChangeListener(final TextChangeListener l) {
		((Text)this.control).addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				// nop
			}
			@Override
			public void keyReleased(KeyEvent arg0) {
				//TextChangedEvent event = new TextChangedEvent(null);
				l.textChanged(null);
			}
		});
	}

	@Override
	public String getText() {
		return ((Text)this.control).getText();
	}

	@Override
	public void setText(String s) {
		((Text)this.control).setText(s);
	}

	@Override
	public boolean isAvailable() {
		return true;
	}

}
