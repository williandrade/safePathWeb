package com.up.util;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.up.model.Usuario;

public class GenericDAOImpl<T extends BaseDAO, TID> implements
		GenericDAO<T, TID> {
	protected SessionFactory sessionFactory;
	protected Class<T> entityClass;
	
	
	public GenericDAOImpl(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	@Override
	public Session getGenericSession() {
		return this.sessionFactory.getCurrentSession();
	}

	@Override
	public <T> T save(final T o) {
		sessionFactory.getCurrentSession().persist(o);
		return o;
	}

	@Override
	public void delete(final Object object) {
		sessionFactory.getCurrentSession().delete(object);
	}

	@Override
	public <T> T get(final TID id) {
		return (T) sessionFactory.getCurrentSession().get(entityClass, (Serializable) id);
	}

	@Override
	public <T> T merge(final T o) {
		return (T) sessionFactory.getCurrentSession().merge(o);
	}

	@Override
	public <T> void saveOrUpdate(final T o) {
		sessionFactory.getCurrentSession().saveOrUpdate(o);
	}

	@Override
	public <T> List<T> getAll(final Class<T> type) {
		final Session session = sessionFactory.getCurrentSession();
		final Criteria crit = session.createCriteria(type);
		return crit.list();
	}
}
