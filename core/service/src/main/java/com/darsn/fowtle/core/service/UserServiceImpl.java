package com.darsn.fowtle.core.service;

import org.springframework.stereotype.Service;

import com.darsn.fowtle.core.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public User login(String username, String password) {
		if (username.equals("jianmin")
				&& password.equals("huang")) {
			User user = new User();
			
			user.setUsername(username);
			user.setPassword(password);
			
			return user;
		}
		
		return null;
	}

}
