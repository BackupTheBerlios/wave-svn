package de.gulden.modeling.wave.diagram.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.ConnectionsPreferencePage;
import org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.jface.preference.IPreferenceStore;

public class DiagramConnectionsPreferencePageBase extends ConnectionsPreferencePage {

	// use own implementation of initializer
	//@Override
	public static void initDefaults(IPreferenceStore preferenceStore) {
		preferenceStore.setDefault(IPreferenceConstants.PREF_LINE_STYLE, Routing.RECTILINEAR);
	}
}
