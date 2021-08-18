package com.dsu2021.pj.domain.user.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class User {
    private Long user_index;
	private String name;
	private String email;
	private Date birthday;
	private String phone;
	private Date register_date;
	private String password;
}