package com.ly.hs.service.impl;

import java.io.Serializable;
import java.util.List;

import com.ly.hs.dao.BaseDao;
import com.ly.hs.service.BaseService;

public class BaseServiceImpl<T extends Serializable> implements BaseService<T> {

	private BaseDao<T> baseDao;
	
	@Override
	public void save(T entity) {
		this.baseDao.save(entity);
	}

	@Override
	public T get(Serializable id) {
		return this.baseDao.get(id);
	}

	@Override
	public void delete(T entity) {
		this.baseDao.delete(entity);
	}

	@Override
	public List<T> getAll() {
		return this.baseDao.getAll();
	}

	public BaseDao<T> getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(BaseDao<T> baseDao) {
		this.baseDao = baseDao;
	}

}
