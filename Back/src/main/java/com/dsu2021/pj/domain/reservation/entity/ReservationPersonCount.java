package com.dsu2021.pj.domain.reservation.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ReservationPersonCount {
    private Long reservationIndex;
    private int adult;
    private int child;
}
