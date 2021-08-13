package com.dsu2021.pj.domain.user.entity;

import java.util.Date;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PossessionCoupon {
	private Long user_index;
	private Long coupon_index;
	private int amount;
	private Date terminate_date;
}
