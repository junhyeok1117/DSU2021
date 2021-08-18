package com.dsu2021.pj.domain.reservation.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PaymentCancel {
    private Long reservationIndex;
    private Date cancelDate;
    private String cancelReason;
}
