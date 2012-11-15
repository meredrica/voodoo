package org.meredrica.voodoo.lib.fragments;

import org.meredrica.voodoo.lib.R;
import org.meredrica.voodoo.lib.interfaces.IVoodooFragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * I got tha voodoo impl!
 * 
 * @author Florian Westreicher aka meredrica
 * @since Nov 15, 2012
 */
public class VoodooLibFragment extends Fragment implements IVoodooFragment {

	private TextView textView;

	@Override
	public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_voodoo, null);
		textView = (TextView) v.findViewById(R.id.voodoo_text);
		return v;
	}

	@Override
	public void voodoo(final String magik) {
		textView.setText(magik);
	}

}
