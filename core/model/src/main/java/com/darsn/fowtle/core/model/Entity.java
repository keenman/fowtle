package com.darsn.fowtle.core.model;

public abstract class Entity<K> {
	protected K id;
	
	public void setId(K id) {
		this.id = id;
	}
	
	public K getId() {
		return id;
	}
}
