package com.dsu2021.pj.domain.user.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PossessionCard {
	private Long card_index;
	private Long user_index;
	private String card_name;
}
