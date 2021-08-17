package com.dsu2021.pj.domain.room.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class SearchedRoomDTO {
	    private Long room_index;
	    private String[] image_path;
	    private String category_location;
	    private String category_kind;
	    private String room_name;
	    private int max_person;
	    private Object facility;
	    private float star_rating;
	    private int number_of_reviews;
	    private boolean is_wishlist;
}
