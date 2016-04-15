/**
 * Project: spring-social-google
 * Package: org.springframework.social.google.api.impl
 * FileName: GooglePlusOperationsImpl.java
 * Author : huu.tra
 */
package org.springframework.social.google.api.impl;

import java.io.IOException;

import org.springframework.social.google.api.GooglePlusOperations;

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.plus.Plus;
import com.google.api.services.plus.Plus.Activities;
import com.google.api.services.plus.Plus.People;
import com.google.api.services.plus.model.Person;

/**
 * @author huu.tra
 *
 */
public class GooglePlusOperationsImpl implements GooglePlusOperations {
	private final Plus googlePlus;

	/**
	 * @param googlePlus
	 */
	public GooglePlusOperationsImpl(String accessTokent) {
		super();
		HttpTransport httpTransport = new NetHttpTransport();
		JsonFactory jsonFactory = new JacksonFactory();
		HttpRequestInitializer requestInitializer = new GoogleCredential().setAccessToken(accessTokent);
		googlePlus = new Plus.Builder(httpTransport, jsonFactory, requestInitializer).build();
	}

	@Override
	public Person fetchUser(String userId) throws IOException {
		People.Get get = googlePlus.people().get(userId);
		Person result = get.execute();
		return result;
	}

	/* (non-Javadoc)
	 * @see org.springframework.social.google.api.GooglePlusOperations#post(java.lang.String)
	 */
	@Override
	public void post(String msg) {
		Activities activities = googlePlus.activities();
		
		
	}
}
