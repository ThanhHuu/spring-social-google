/**
 * Project: spring-social-google
 * Package: org.springframework.social.google.connect
 * FileName: GoogleConnectionFactory.java
 * Author : huu.tra
 */
package org.springframework.social.google.connect;

import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.support.OAuth2ConnectionFactory;
import org.springframework.social.google.api.Google;
import org.springframework.social.oauth2.OAuth2ServiceProvider;

/**
 * @author huu.tra
 *
 */
public class GoogleConnectionFactory extends OAuth2ConnectionFactory<Google> {

	private static final String PROVIDER_ID = "google";
	/**
	 * @param providerId
	 * @param serviceProvider
	 * @param apiAdapter
	 */
	public GoogleConnectionFactory(String providerId, OAuth2ServiceProvider<Google> serviceProvider,
			ApiAdapter<Google> apiAdapter) {
		super(providerId, serviceProvider, apiAdapter);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param clientId
	 * @param secretKey
	 */
	public GoogleConnectionFactory(String clientId, String secretKey) {
		super(PROVIDER_ID, new GoogleServiceProvider(clientId, secretKey), new GoogleAdapter());
	}
}