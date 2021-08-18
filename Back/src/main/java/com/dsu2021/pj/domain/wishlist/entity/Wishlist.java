package com.dsu2021.pj.domain.wishlist.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Wishlist {
	private Long roomIndex;
	private Long userIndex;
	private String wishlistName;
}
