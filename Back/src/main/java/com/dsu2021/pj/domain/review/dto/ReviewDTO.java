package com.dsu2021.pj.domain.review.dto;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Alias("reviewDTO")// RoomMapper.xml에서 쓰기 위한 별명 지정
@Setter
@Getter
public class ReviewDTO {
	
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class ReviewReq{
	    private Long roomIndex;
	    private String content;
	    private int starRating;
	}
	
	
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class ReviewRes{
	    private Long roomIndex;
	    private Long userIndex;
	    private String content;
	    private Integer starRating;
	    private Date registerDate;
	}


}
