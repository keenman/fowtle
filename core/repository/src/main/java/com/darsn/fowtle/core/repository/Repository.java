package com.darsn.fowtle.core.repository;

import java.util.List;

import com.darsn.fowtle.core.model.Entity;

public interface Repository<T extends Entity<K>, K>  {
	
	T findById(K id);
	
	List<T> findAll();
	
	K save(T model);
	
	void delete(T model);
}
