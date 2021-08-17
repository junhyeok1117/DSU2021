package com.dsu2021.pj.domain.user.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PossessionCoupon {
	private Long user_index;
	private Long coupon_index;
	private int amount;
	private Date terminate_date;
}
