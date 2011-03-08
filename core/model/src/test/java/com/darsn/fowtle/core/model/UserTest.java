package com.darsn.fowtle.core.model;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class UserTest {
	
	private User createUser(String username, String password) {
		User user = new User();
		
		user.setUsername(username);
		user.setPassword(password);
		
		return user;
	}
	
	@Test
	@Ignore
	public void equalsBySameUsernamePassword() {
		User user1 = createUser("username", "password");
		User user2 = createUser("username", "password");
		
		Assert.assertNotSame(user1, user2);
		Assert.assertEquals(user1, user2);
	}
}
