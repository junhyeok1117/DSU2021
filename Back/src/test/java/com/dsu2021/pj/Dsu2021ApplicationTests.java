package com.dsu2021.pj;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Dsu2021ApplicationTests {

	@Autowired
	DataSource dataSource; // 데이터 소스가 bean 등록되어있는지 테스트 // 스프링 부트 2점대에서는 HikariCP를 기본적으로 사용한다.
	
    @Test
    void contextLoads() {
    	System.out.println(dataSource.getClass());// com.zaxxer.hikari.HikariDataSource 등록 확인
    }

}
