package com.dsu2021.pj.domain.user.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.ibatis.type.Alias;

@Alias("User")//mybatis에서 패키지 전체 입력을 대신하는 별칭
@AllArgsConstructor
@Getter
public class User {
    private Long userIndex;
	private String name;
	private String email;
	private Date birthday;
	private String phone;
	private Date registerDate;
	private String password;
}