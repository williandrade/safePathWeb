package com.up.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.up.util.BaseDAO;

@Entity
@Table(name = "FEEDBACK")
public class Feedback extends BaseDAO {

	@Id
	@Column(name = "FEEDBACK_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int feedbackId;

	@Column(name = "FEEDBACK_TEXT")
	private String feedbackText;

	@Column(name = "FEEDBACK_USER")
	private String feedbackUser;

	public Feedback(String feedbackText, String feedbackUser) {
		super();
		this.feedbackText = feedbackText;
		this.feedbackUser = feedbackUser;

	}

	public String getFeedbackText() {
		return feedbackText;
	}

	public void setFeedbackText(String feedbackText) {
		this.feedbackText = feedbackText;
	}

	public String getFeedbackUser() {
		return feedbackUser;
	}

	public void setFeedbackUser(String feedbackUser) {
		this.feedbackUser = feedbackUser;
	}

}
