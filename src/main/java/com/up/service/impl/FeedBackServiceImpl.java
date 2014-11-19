package com.up.service.impl;

import java.util.List;

import com.up.dao.FeedBackDAO;
import com.up.dao.UsuarioDAO;
import com.up.model.Feedback;
import com.up.service.FeedBackService;

public class FeedBackServiceImpl implements FeedBackService{
	
	private FeedBackDAO feedBackDAO;

	public void setFeedBackDAO(FeedBackDAO feedBackDAO) {
        this.feedBackDAO = feedBackDAO;
    }
	
	@Override
	public Feedback addFeedBack(Feedback feed) {
		// TODO Auto-generated method stub
		return this.feedBackDAO.save(feed);
	}

	@Override
	public void updateFeedBack(Feedback feed) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Feedback> listFeedBack() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Feedback getFeedBackById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeFeedBack(int id) {
		// TODO Auto-generated method stub
		
	}

}
