package com.up.service;

import java.util.List;

import com.up.dto.FeedbackDto;
import com.up.model.Feedback;

public interface FeedBackService {

	public FeedbackDto addFeedBack(FeedbackDto feed);
    public void updateFeedBack(FeedbackDto feed);
    public List<FeedbackDto> listFeedBack();
    public FeedbackDto getFeedBackById(int id);
    public void removeFeedBack(int id);
}
