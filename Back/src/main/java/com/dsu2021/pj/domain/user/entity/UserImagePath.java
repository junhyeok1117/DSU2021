package com.dsu2021.pj.domain.user.entity;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class UserImagePath {
	private Long user_index;
	private String image_path;
}
