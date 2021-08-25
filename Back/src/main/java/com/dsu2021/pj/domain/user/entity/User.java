package com.dsu2021.pj.domain.user.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.ibatis.type.Alias;

@AllArgsConstructor
@Getter
public class User {
    private Long userIndex;
	private String name;
	private String email;
	private String birthday;
	private String phone;
	private Date registerDate;
	private String password;
}