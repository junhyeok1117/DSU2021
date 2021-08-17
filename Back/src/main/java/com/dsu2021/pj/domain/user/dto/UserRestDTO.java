package com.dsu2021.pj.domain.user.dto;

import java.util.Date;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class UserRestDTO{
    private Long user_index;
	private String name;
	private String email;
	private Date birthday;
	private String phone;
	private Date register_date;
}