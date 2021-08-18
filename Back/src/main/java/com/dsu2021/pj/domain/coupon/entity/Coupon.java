package com.dsu2021.pj.domain.coupon.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Coupon {
	private Long couponIndex;
	private String couponName;
	private String discountValue;
	private int discountInt;
}
