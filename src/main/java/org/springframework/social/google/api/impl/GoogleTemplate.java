/**
 * Project: spring-social-google
 * Package: org.springframework.social.google.api.impl
 * FileName: GoogleTemplate.java
 * Author : huu.tra
 */
package org.springframework.social.google.api.impl;

import org.springframework.social.google.api.Google;
import org.springframework.social.google.api.GooglePlusOperations;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;

/**
 * @author huu.tra
 *
 */
public class GoogleTemplate extends AbstractOAuth2ApiBinding implements Google {

	private final GooglePlusOperations googlePlusOperations;
	
	public GoogleTemplate(String tokent) {
		super(tokent);
		googlePlusOperations = new GooglePlusOperationsImpl(tokent);
	}
	
	public GooglePlusOperations getGooglePlus() {
		return googlePlusOperations;
	}

}