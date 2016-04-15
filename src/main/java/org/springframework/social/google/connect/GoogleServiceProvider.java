/**
 * Project: spring-social-google
 * Package: org.springframework.social.google.connect
 * FileName: GoogleServiceProvider.java
 * Author : huu.tra
 */
package org.springframework.social.google.connect;

import org.springframework.social.google.api.Google;
import org.springframework.social.google.api.impl.GoogleTemplate;
import org.springframework.social.google.oauth2.GoogleOauth2Operations;
import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;
import org.springframework.social.oauth2.OAuth2Operations;

/**
 * @author huu.tra
 *
 */
public class GoogleServiceProvider extends AbstractOAuth2ServiceProvider<Google>{

	private static final String AUTH_URL = "https://accounts.google.com/o/oauth2/v2/auth";
	private static final String TOKEN_URL = "https://www.googleapis.com/oauth2/v4/token";
	/**
	 * @param oauth2Operations
	 */
	public GoogleServiceProvider(OAuth2Operations oauth2Operations) {
		super(oauth2Operations);
	}

	/**
	 * 
	 */
	public GoogleServiceProvider(String clientId, String secretKey) {
		super(getGoogleOAuthOperations(clientId, secretKey));
	}
	
	private static OAuth2Operations getGoogleOAuthOperations(String clientId, String secretKey){
		GoogleOauth2Operations googleOAuthOperations = new GoogleOauth2Operations(clientId, secretKey, AUTH_URL, null, TOKEN_URL);
		googleOAuthOperations.setUseParametersForClientAuthentication(true);
		return googleOAuthOperations;
	}
	@Override
	public Google getApi(String token) {
		return new GoogleTemplate(token);
	}

}
