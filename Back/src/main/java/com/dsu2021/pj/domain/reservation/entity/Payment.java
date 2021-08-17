package com.dsu2021.pj.domain.reservation.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Payment {
    private Long reservation_index;
    private Long coupon_index;
    private Long card_index;
    private int discount;
    private Date payment_date;
    private String payment_value;
}
