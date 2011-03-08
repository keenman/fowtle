package com.darsn.fowtle.core.service;

import com.darsn.fowtle.core.model.User;

public interface UserService {
	User login(String username, String password);
}
