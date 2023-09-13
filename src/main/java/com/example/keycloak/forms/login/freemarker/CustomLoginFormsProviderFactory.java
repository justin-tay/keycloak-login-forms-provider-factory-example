package com.example.keycloak.forms.login.freemarker;

import org.keycloak.forms.login.LoginFormsProvider;
import org.keycloak.forms.login.freemarker.FreeMarkerLoginFormsProviderFactory;
import org.keycloak.models.KeycloakSession;

public class CustomLoginFormsProviderFactory extends FreeMarkerLoginFormsProviderFactory {

	@Override
	public LoginFormsProvider create(KeycloakSession session) {
		return new CustomLoginFormsProvider(session);
	}
}