package com.dsu2021.pj.global.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;

//mybatis 설정 클래스

import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan(basePackages = {"com.dsu2021.pj.domain"},annotationClass = org.apache.ibatis.annotations.Mapper.class) // repository에서 mapper 인터페이스로 처리
public class MybatisConfig {

	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		
		sqlSessionFactory.setDataSource(dataSource); // dataSource 설정
		sqlSessionFactory.setTypeAliasesPackage("com.dsu2021.pj.domain"); // 해당 패키지의 클래스는 별칭으로 매핑 됨
		
		return sqlSessionFactory.getObject();
	}
	
	@Bean
	public SqlSessionTemplate sqlSession (SqlSessionFactory sqlSessionFactory) {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
	
}
