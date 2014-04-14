package com.napster.mobile.android.daggerlogin.service.eremedy;

public class LoginResponse {
	private String email;
	private String loginToken;
	private String billingPartner;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLoginToken() {
		return loginToken;
	}
	public void setLoginToken(String loginToken) {
		this.loginToken = loginToken;
	}
	public String getBillingPartner() {
		return billingPartner;
	}
	public void setBillingPartner(String billingPartner) {
		this.billingPartner = billingPartner;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LoginResponse [email=").append(email)
				.append(", loginToken=").append(loginToken)
				.append(", billingPartner=").append(billingPartner).append("]");
		return builder.toString();
	}

	public LoginResponse() {
		super();
	}
	
	
}
