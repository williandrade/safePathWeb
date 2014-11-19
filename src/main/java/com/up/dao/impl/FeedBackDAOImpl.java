package com.up.dao.impl;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.up.dao.FeedBackDAO;
import com.up.model.Feedback;
import com.up.util.GenericDAOImpl;

public class FeedBackDAOImpl extends GenericDAOImpl<Feedback, Integer> implements FeedBackDAO{

	private static final Logger logger = LoggerFactory.getLogger(FeedBackDAOImpl.class);
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	public FeedBackDAOImpl() {
		super(Feedback.class);
	}

}
