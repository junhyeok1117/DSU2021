package com.dsu2021.pj.domain.host.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.dsu2021.pj.domain.host.entity.Host;

@Mapper
@Repository
public interface HostMapper {

//	READ
	public Host getHostByUserIndex(Long userIndex);
	
	public String getStartDateByUserIndex(Long userIndex);
	
//	CRATE
	public void addHost(Long userIndex);
}
