package com.napster.mobile.android.daggerlogin.test;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.TextView;

import com.napster.mobile.android.daggerlogin.LoginActivity;
import com.napster.mobile.android.daggerlogin.NapsterApplication;
import com.napster.mobile.android.daggerlogin.R;

public class LoginTest extends ActivityInstrumentationTestCase2<LoginActivity> {

	Activity activity;
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		getInstrumentation().waitForIdleSync();
		NapsterApplication app =(NapsterApplication) getActivity().getApplication();
		app.setERemedyModule(new TestERemedyModule());
		activity = getActivity();
		((LoginActivity)activity).inject();
	}

	public LoginTest() {
		super(LoginActivity.class);
	}

	public void testDummy() throws InterruptedException {
		TouchUtils.clickView(this, activity.findViewById(R.id.btnLogin));
		getInstrumentation().waitForIdleSync();
		
		String text = ((TextView)activity.findViewById(R.id.editLoginResult)).getText().toString();
		System.out.println(text);
	}
}
