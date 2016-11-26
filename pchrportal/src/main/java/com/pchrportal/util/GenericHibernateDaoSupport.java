package com.pchrportal.util;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public abstract class GenericHibernateDaoSupport extends HibernateDaoSupport {
	/**
	 * Method to initialize the hibernate session factory.
	 * @param sessionFactory
	 */
	@Resource
	public void initializeSession(SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}

}
