package com.up.dto;

import com.up.model.Usuario;

public class FeedbackDto {

	private int feedbackId;
	
	private String feedbackText;

	private Usuario feedbackUser;

	public int getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	public String getFeedbackText() {
		return feedbackText;
	}

	public void setFeedbackText(String feedbackText) {
		this.feedbackText = feedbackText;
	}

	public Usuario getFeedbackUser() {
		return feedbackUser;
	}

	public void setFeedbackUser(Usuario feedbackUser) {
		this.feedbackUser = feedbackUser;
	}
	
	
	
}
