package com.dsu2021.pj.domain.reservation.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ReservationPersonCount {
    private Long reservation_index;
    private int adult;
    private int child;
}
