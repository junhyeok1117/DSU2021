package com.dsu2021.pj.domain.review.entity;

import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Builder
@Getter
public class Review {
    private Long room_index;
    private Long user_index;
    private String content;
    private int star_rating;
    private Date register_date;
}
