package com.ly.hs.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T extends Serializable> {

	public void save(T entity);
	
	public T get(Serializable id);
	
	public void delete(T entity);
	
	public List<T> getAll();
	
}
