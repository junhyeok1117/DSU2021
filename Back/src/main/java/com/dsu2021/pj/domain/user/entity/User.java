package com.dsu2021.pj.domain.user.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class User {
    private Long userIndex;
	private String name;
	private Long email;
	private Date birthday;
	private String phone;
	private Date registerDate;
	private String password;
}