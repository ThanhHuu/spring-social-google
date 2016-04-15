/**
 * Project: spring-social-google
 * Package: org.springframework.social.google.oauth2
 * FileName: GoogleOauth2Operations.java
 * Author : huu.tra
 */
package org.springframework.social.google.oauth2;

import org.springframework.social.oauth2.OAuth2Template;

/**
 * @author huu.tra
 *
 */
public class GoogleOauth2Operations extends OAuth2Template{

	/**
	 * @param clientId
	 * @param clientSecret
	 * @param authorizeUrl
	 * @param accessTokenUrl
	 */
	public GoogleOauth2Operations(String clientId, String clientSecret, String authorizeUrl, String accessTokenUrl) {
		super(clientId, clientSecret, authorizeUrl, accessTokenUrl);
	}

	/**
	 * @param clientId
	 * @param clientSecret
	 * @param authorizeUrl
	 * @param authenticateUrl
	 * @param accessTokenUrl
	 */
	public GoogleOauth2Operations(String clientId, String clientSecret, String authorizeUrl, String authenticateUrl,
			String accessTokenUrl) {
		super(clientId, clientSecret, authorizeUrl, authenticateUrl, accessTokenUrl);
	}

	
}
