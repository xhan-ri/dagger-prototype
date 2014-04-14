package com.napster.mobile.android.daggerlogin;

import android.app.Activity;
import android.os.Bundle;

import com.napster.mobile.android.daggerlogin.fragments.LoginFragment;

public class LoginActivity extends Activity {

	LoginFragment loginFragment;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		if (savedInstanceState == null) {
			loginFragment = new LoginFragment();
			getFragmentManager().beginTransaction()
			.add(R.id.container, loginFragment).commit();
		}
	}
	
	public void inject() {
		NapsterApplication application = (NapsterApplication) getApplication();
		if (loginFragment != null) {
			application.inject(loginFragment);
		}
	}

}
