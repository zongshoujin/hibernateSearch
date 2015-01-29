package com.ly.hs.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ly.hs.dao.BaseDao;

public class BaseDaoImpl<T extends Serializable> implements BaseDao<T> {

	@Resource
	private SessionFactory sessionFactory;
	
	private Class<T> entityClass;
	
	@SuppressWarnings("unchecked")
	public BaseDaoImpl() {
		Type type = this.getClass().getGenericSuperclass();
		this.entityClass  = (Class<T>)((ParameterizedType)type).getActualTypeArguments()[0];
	}

	@Override
	public void save(T entity) {
		this.getSession().save(entity);
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(Serializable id) {
		return (T)this.getSession().get(entityClass, id);
	}

	@Override
	public void delete(T entity) {
		this.getSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> getAll() {
		String hql = "from "+entityClass.getName();
		return this.getSession().createQuery(hql).list();
	}
	
	private Session getSession(){
		return this.sessionFactory.getCurrentSession();
	}

}
