package com.dsu2021.pj.domain.reservation.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Payment {
    private Long reservationIndex;
    private Long couponIndex;
    private Long cardIndex;
    private int discount;
    private Date paymentDate;
    private String paymentValue;
}
