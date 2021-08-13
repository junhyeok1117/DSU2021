package com.dsu2021.pj.domain.wishlist.entity;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Wishlist {
	private Long room_index;
	private Long user_index;
	private String wishlist_name;
}
