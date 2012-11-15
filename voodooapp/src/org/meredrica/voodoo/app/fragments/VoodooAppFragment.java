package org.meredrica.voodoo.app.fragments;

import org.meredrica.voodoo.app.R;
import org.meredrica.voodoo.lib.interfaces.IVoodooFragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * This has even more voodoo!
 * 
 * @author Florian Westreicher aka meredrica
 * @since Nov 15, 2012
 */
public class VoodooAppFragment extends Fragment implements IVoodooFragment {

	@Override
	public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_voodoo_app, null);
	}

	@Override
	public void voodoo(final String magik) {
		// see what i did there?
		// i changed the activity layout and rerouted a request from the library to my own fragment
		// that this even works is amazing but not really a surprise
		Toast.makeText(getActivity(), magik, Toast.LENGTH_LONG).show();
	}

}
