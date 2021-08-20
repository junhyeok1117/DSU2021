package com.dsu2021.pj.domain.room.dto;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Alias("reviewStatistic")
@AllArgsConstructor
@Getter
public class ReviewStatisticDTO {
	Integer starRating;
	Float count;
}
