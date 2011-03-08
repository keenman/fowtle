package com.darsn.fowtle.core.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.darsn.fowtle.core.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/ApplicationContext-service-test.xml")
public class UserServiceTest {
	
	@Autowired
	private UserService userService;
	
	@Test
	public void loginByUsernameAndPasswordSuccess() {
		String username = "jianmin";
		String password = "huang";
		
		User user = userService.login(username, password);
		
		assertNotNull(user);
		assertEquals(username, user.getUsername());
		assertEquals(password, user.getPassword());
	}
}
