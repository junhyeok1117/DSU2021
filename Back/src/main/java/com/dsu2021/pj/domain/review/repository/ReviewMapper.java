package com.dsu2021.pj.domain.review.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.dsu2021.pj.domain.review.dto.ReviewDTO;
import com.dsu2021.pj.domain.review.dto.ReviewDTO.ReviewRes;
import com.dsu2021.pj.domain.review.entity.Review;
import com.dsu2021.pj.domain.room.dto.RoomDTO;


@Mapper
@Repository
public interface ReviewMapper {
	
	// SELECT
	public List<ReviewDTO.ReviewRes> getReviewsByRoomIndex(Long roomIndex);

	public List<ReviewDTO.ReviewRes> getReviewsByUserIndex(Long userIndex);
	
	//INSERT
	public void insertReview(Review review);
}
