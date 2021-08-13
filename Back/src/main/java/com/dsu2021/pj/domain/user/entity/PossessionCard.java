package com.dsu2021.pj.domain.user.entity;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PossessionCard {
	private Long card_index;
	private Long user_index;
	private String card_name;
}
