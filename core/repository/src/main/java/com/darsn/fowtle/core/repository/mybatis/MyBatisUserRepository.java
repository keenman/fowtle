package com.darsn.fowtle.core.repository.mybatis;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.darsn.fowtle.core.model.User;
import com.darsn.fowtle.core.repository.UserRepository;

@Repository
public class MyBatisUserRepository implements UserRepository {

	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long save(User model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(User model) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean existUser(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User findUser(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
