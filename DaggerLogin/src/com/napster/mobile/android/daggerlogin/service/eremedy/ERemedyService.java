package com.napster.mobile.android.daggerlogin.service.eremedy;

public class ERemedyService implements IERemedy {

	@Override
	public LoginResponse login(String username, String password) {
		LoginResponse resp = new LoginResponse();
		resp.setEmail("prod@rhapsody.lan");
		resp.setLoginToken("prod token");
		resp.setBillingPartner("napster");
		return resp;
	}

}
