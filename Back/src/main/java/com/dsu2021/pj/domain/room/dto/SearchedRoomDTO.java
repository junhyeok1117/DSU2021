package com.dsu2021.pj.domain.room.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

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
