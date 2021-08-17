package com.dsu2021.pj.domain.user.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserRestDTO{
    private Long user_index;
	private String name;
	private String email;
	private Date birthday;
	private String phone;
	private Date register_date;
}