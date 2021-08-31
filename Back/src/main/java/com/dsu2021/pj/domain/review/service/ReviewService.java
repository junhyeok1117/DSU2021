package com.dsu2021.pj.domain.review.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dsu2021.pj.domain.review.dto.ReviewDTO;
import com.dsu2021.pj.domain.review.dto.ReviewDTO.ReviewRes;
import com.dsu2021.pj.domain.review.entity.Review;
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
	
	@Transactional
	public ReviewDTO.ReviewRes insertReview(ReviewDTO.ReviewReq req) {
		
		// 로그인 구현되면 유저정보 넣는부분 수정 필요
		Long userIndex = 2l;
		
		Review review = new Review(req.getRoomIndex(),userIndex,req.getContent(),req.getStarRating(),req.getRegisterDate());
		reviewMapper.insertReview(review);
		
		return new ReviewDTO.ReviewRes(review.getRoomIndex(),userIndex,review.getContent(),review.getStarRating(),review.getRegisterDate());
	}
	
}
