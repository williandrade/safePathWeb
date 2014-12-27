package com.up.util;

import java.util.List;

import org.hibernate.Session;

public interface GenericDAO<T extends BaseDAO, TID>{

	public Session getGenericSession();
	
	public <T> T save(final T o);

	public void delete(final Object object);

	public <T> T get(final TID id);

	public <T> T merge(final T o);

	public <T> void saveOrUpdate(final T o);

	public <T> List<T> getAll(final Class<T> type);
}
