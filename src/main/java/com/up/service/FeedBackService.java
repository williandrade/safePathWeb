package com.up.service;

import java.util.List;

import com.up.model.Feedback;

public interface FeedBackService {

	public Feedback addFeedBack(Feedback feed);
    public void updateFeedBack(Feedback feed);
    public List<Feedback> listFeedBack();
    public Feedback getFeedBackById(int id);
    public void removeFeedBack(int id);
}
