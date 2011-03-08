package com.darsn.fowtle.core.repository;

import com.darsn.fowtle.core.model.User;

public interface UserRepository extends Repository<User, Long> {
	
	boolean existUser(String username);
	
	User findUser(String username, String password);
}
