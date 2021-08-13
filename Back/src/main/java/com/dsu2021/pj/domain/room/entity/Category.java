package com.dsu2021.pj.domain.room.entity;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Category {
	private Long category_index;
	private String location;
	private String kind;
}
