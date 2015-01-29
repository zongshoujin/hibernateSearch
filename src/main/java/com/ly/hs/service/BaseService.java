package com.ly.hs.service;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T extends Serializable> {

	public void save(T entity);
	
	public T get(Serializable id);
	
	public void delete(T entity);
	
	public List<T> getAll();
}
