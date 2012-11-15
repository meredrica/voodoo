package org.meredrica.voodoo.lib.activities;

import org.meredrica.voodoo.lib.R;
import org.meredrica.voodoo.lib.interfaces.IVoodooFragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;

public class VoodooLibActivity extends FragmentActivity {

	@Override
	public void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_voodoo_lib);
	}

	@Override
	public boolean onCreateOptionsMenu(final Menu menu) {
		getMenuInflater().inflate(R.menu.activity_voodoo_lib, menu);
		return true;
	}

	@Override
	protected void onResume() {
		IVoodooFragment fragment = (IVoodooFragment) getSupportFragmentManager().findFragmentById(R.id.voodoo_fragment);
		fragment.voodoo("zomg da magik!");
		super.onResume();
	}
}
