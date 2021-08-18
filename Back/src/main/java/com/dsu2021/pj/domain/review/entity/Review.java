package com.dsu2021.pj.domain.review.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.Date;

@AllArgsConstructor
@Getter
public class Review {
    private Long roomIndex;
    private Long userIndex;
    private String content;
    private int starRating;
    private Date registerDate;
}
