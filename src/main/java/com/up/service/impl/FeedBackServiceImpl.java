package com.up.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.transaction.annotation.Transactional;

import com.up.dao.FeedBackDAO;
import com.up.dto.FeedbackDto;
import com.up.model.Feedback;
import com.up.service.FeedBackService;

public class FeedBackServiceImpl implements FeedBackService{
	
	private FeedBackDAO feedBackDAO;
	ModelMapper modelMapper = new ModelMapper();

	public void setFeedBackDAO(FeedBackDAO feedBackDAO) {
        this.feedBackDAO = feedBackDAO;
    }
	
	@Override
	@Transactional
	public FeedbackDto addFeedBack(FeedbackDto feed) {
		// TODO Auto-generated method stub
		Feedback feedback = modelMapper.map(feed, Feedback.class);
		
		Feedback saved = this.feedBackDAO.save(feedback);
	
		FeedbackDto retorno = modelMapper.map(saved, FeedbackDto.class);
		return retorno;
	}

	@Override
	@Transactional
	public void updateFeedBack(FeedbackDto feed) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public List<FeedbackDto> listFeedBack() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public FeedbackDto getFeedBackById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void removeFeedBack(int id) {
		// TODO Auto-generated method stub
		
	}

}
