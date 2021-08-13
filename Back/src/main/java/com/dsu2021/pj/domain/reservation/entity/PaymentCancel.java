package com.dsu2021.pj.domain.reservation.entity;

import java.util.Date;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PaymentCancel {
    private Long reservation_index;
    private Date cancel_date;
    private String cancel_reason;
}
