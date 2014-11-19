package com.up.dto;

import com.up.model.Usuario;

public class FeedbackDto {

	private String feedbackText;

	private Usuario feedbackUser;

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
