package com.dsu2021.pj.domain.review.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dsu2021.pj.domain.review.dto.ReviewDTO;
import com.dsu2021.pj.domain.review.service.ReviewService;

@CrossOrigin(origins="*")
@RestController
public class InsertReviewController {
	
	@Autowired
	private ReviewService service;
	
	@PostMapping("/reviews")
	public ResponseEntity<?> insertReview(@RequestBody ReviewDTO.ReviewReq req){
		try {
			service.insertReview(req);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
		
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
