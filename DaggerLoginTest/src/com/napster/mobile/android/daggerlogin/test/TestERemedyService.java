package com.napster.mobile.android.daggerlogin.test;

import com.napster.mobile.android.daggerlogin.service.eremedy.IERemedy;
import com.napster.mobile.android.daggerlogin.service.eremedy.LoginResponse;

public class TestERemedyService implements IERemedy {

	@Override
	public LoginResponse login(String username, String password) {
		LoginResponse resp = new LoginResponse();
		resp.setEmail("test@rhapsody.lan");
		resp.setBillingPartner("vivo");
		resp.setLoginToken("test login token");
		return resp;
	}

}
