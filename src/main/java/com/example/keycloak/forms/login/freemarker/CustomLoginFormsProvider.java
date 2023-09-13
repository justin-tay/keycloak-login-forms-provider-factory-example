package com.example.keycloak.forms.login.freemarker;

import org.keycloak.forms.login.LoginFormsPages;
import org.keycloak.forms.login.freemarker.FreeMarkerLoginFormsProvider;
import org.keycloak.models.KeycloakSession;

import jakarta.ws.rs.core.Response;

public class CustomLoginFormsProvider extends FreeMarkerLoginFormsProvider {

	public CustomLoginFormsProvider(KeycloakSession session) {
		super(session);
	}

	@Override
	protected Response createResponse(LoginFormsPages page) {
		if (LoginFormsPages.LOGIN_PASSWORD.equals(page)) {
			this.attributes.put("attributes", this.user.getAttributes());
		}
		return super.createResponse(page);
	}
}
