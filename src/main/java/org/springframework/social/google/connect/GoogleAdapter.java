/**
 * Project: spring-social-google
 * Package: org.springframework.social.google.connect
 * FileName: GoogleAdapter.java
 * Author : huu.tra
 */
package org.springframework.social.google.connect;

import java.io.IOException;
import java.util.List;

import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.connect.UserProfileBuilder;
import org.springframework.social.google.api.Google;

import com.google.api.services.plus.model.Person;

/**
 * @author huu.tra
 *
 */
public class GoogleAdapter implements ApiAdapter<Google> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.social.connect.ApiAdapter#test(java.lang.Object)
	 */
	@Override
	public boolean test(Google google) {
		return false;
	}

	@Override
	public void setConnectionValues(Google google, ConnectionValues values) {
		Person person;
		try {
			person = google.getGooglePlus().fetchUser("me");
			values.setProviderUserId(person.getId());
			values.setDisplayName(person.getDisplayName());
			values.setProfileUrl(person.getUrl());
			values.setImageUrl(person.getImage().getUrl());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public UserProfile fetchUserProfile(Google google) {
		try {
			Person person = google.getGooglePlus().fetchUser("me");
			Person.Name name = person.getName();
			List<Person.Emails> mails = person.getEmails();
			UserProfile result = new UserProfileBuilder().setName(person.getDisplayName())
					.setFirstName(name.getGivenName()).setLastName(name.getFamilyName())
					.setEmail(mails.get(0).getValue()).build();
			return result;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.social.connect.ApiAdapter#updateStatus(java.lang.
	 * Object, java.lang.String)
	 */
	@Override
	public void updateStatus(Google google, String paramString) {
		try {
			Person person = google.getGooglePlus().fetchUser("me");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
