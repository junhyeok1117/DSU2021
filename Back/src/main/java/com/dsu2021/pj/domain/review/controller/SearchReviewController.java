package com.dsu2021.pj.domain.review.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dsu2021.pj.domain.review.dto.ReviewDTO;
import com.dsu2021.pj.domain.review.service.ReviewService;

@CrossOrigin(origins="*")
@RestController
public class SearchReviewController {
	
	@Autowired
	private ReviewService service;
	
	@GetMapping("/rooms/{roomIndex}/reviews")
	public ResponseEntity<List<ReviewDTO.ReviewRes>> getReviewsByRoomIndex(@PathVariable("roomIndex") Long roomIndex){
		
		List<ReviewDTO.ReviewRes> reviews = service.getReviewsByRoomIndex(roomIndex);
		
		return new ResponseEntity<>(reviews,HttpStatus.OK);
	}
	
	@GetMapping("/users/{userIndex}/reviews")
	public ResponseEntity<List<ReviewDTO.ReviewRes>> getReviewsByUserIndex(@PathVariable("userIndex") Long userIndex){
		
		List<ReviewDTO.ReviewRes> reviews = service.getReviewsByUserIndex(userIndex);
		
		return new ResponseEntity<>(reviews,HttpStatus.OK);
	}
	
}
