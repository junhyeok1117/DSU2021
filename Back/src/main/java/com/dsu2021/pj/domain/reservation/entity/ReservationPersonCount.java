package com.dsu2021.pj.domain.reservation.entity;


import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ReservationPersonCount {
    private Long reservation_index;
    private int adult;
    private int child;
}
