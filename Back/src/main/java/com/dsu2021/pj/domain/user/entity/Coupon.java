package com.dsu2021.pj.domain.user.entity;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Coupon {
	private Long coupon_index;
	private String coupon_name;
	private String discount_value;
	private int discount_int;
	
	

}
