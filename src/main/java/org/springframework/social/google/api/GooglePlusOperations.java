/**
 * Project: spring-social-google
 * Package: org.springframework.social.google.api
 * FileName: GooglePlusOperations.java
 * Author : huu.tra
 */
package org.springframework.social.google.api;

import java.io.IOException;

import com.google.api.services.plus.model.Person;

/**
 * @author huu.tra
 *
 */
public interface GooglePlusOperations {
	/**
	 * 
	 * @param userId
	 * @return
	 * @throws IOException 
	 */
	Person fetchUser(String userId) throws IOException;
	
	void post(String msg);
}
