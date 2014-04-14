package com.napster.mobile.android.daggerlogin.fragments;

import javax.inject.Inject;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;

import com.napster.mobile.android.daggerlogin.NapsterApplication;
import com.napster.mobile.android.daggerlogin.R;
import com.napster.mobile.android.daggerlogin.service.eremedy.IERemedy;
import com.napster.mobile.android.daggerlogin.service.eremedy.LoginResponse;

public class LoginFragment extends Fragment {

	@Inject IERemedy eRemedyService;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		final View view = inflater.inflate(R.layout.fragment_login, container,
				false);
		view.findViewById(R.id.btnLogin).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				LoginResponse resp = eRemedyService.login("username", "password");
				((EditText) view.findViewById(R.id.editLoginResult)).setText(resp.toString());
			}
		});
		return view;
	}
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		 NapsterApplication app = (NapsterApplication)getActivity().getApplication();
		 app.inject(this);
	}

}
