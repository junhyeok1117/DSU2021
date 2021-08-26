package com.dsu2021.pj.domain.review.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsu2021.pj.domain.review.dto.ReviewDTO;
import com.dsu2021.pj.domain.review.dto.ReviewDTO.ReviewRes;
import com.dsu2021.pj.domain.review.repository.ReviewMapper;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewMapper reviewMapper;

	public List<ReviewRes> getReviewsByRoomIndex(Long roomIndex) {
		List<ReviewRes> reviews;
		reviews = reviewMapper.getReviewsByRoomIndex(roomIndex);
		return reviews;
	}

	public List<ReviewRes> getReviewsByUserIndex(Long userIndex) {
		List<ReviewRes> reviews;
		reviews = reviewMapper.getReviewsByUserIndex(userIndex);
		return reviews;
	}
	
	public Long insertReview(ReviewDTO.ReviewReq req) {
		
		
		return (long) 0;
	}
	
}
