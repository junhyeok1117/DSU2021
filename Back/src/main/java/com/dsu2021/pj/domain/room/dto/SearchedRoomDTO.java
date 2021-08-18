package com.dsu2021.pj.domain.room.dto;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Alias("searchedRoom")// RoomMapper.xml에서 쓰기 위한 별명 지정
@AllArgsConstructor
@Getter
public class SearchedRoomDTO {
	    private Long roomIndex;
	    private String[] imagePath;
	    private String categoryLocation;
	    private String categoryKind;
	    private String roomName;
	    private int maxPerson;
	    private Object facility;
	    private float starRating;
	    private int numberOfReviews;
	    private boolean isWishlist;
}
