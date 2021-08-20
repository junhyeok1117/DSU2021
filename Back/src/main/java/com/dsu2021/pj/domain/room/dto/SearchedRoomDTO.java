package com.dsu2021.pj.domain.room.dto;

import java.util.List;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Alias("searchedRoom")// RoomMapper.xml에서 쓰기 위한 별명 지정
@AllArgsConstructor
@Getter
public class SearchedRoomDTO {
	    private Long room_index;
	    private List<String> image_path;
	    private String category_location;
	    private String category_kind;
	    private String room_name;
	    private int max_person;
	    private int bed;
	    private int bath;
	    private List<String> facility;
	    private float star_rating;
	    private int number_of_reviews;
	    private boolean is_wishlist;
}
