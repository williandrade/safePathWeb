package com.up.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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

	@JoinColumn(name = "FEEDBACK_USER")
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
