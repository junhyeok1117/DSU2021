package com.dsu2021.pj.domain.host.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dsu2021.pj.domain.host.repository.HostMapper;

@Service
public class HostService{
	
	//READ
	@Autowired
	private HostMapper hostMapper;
	
	public String getStartDateByUserIndex(Long userIndex){
		return hostMapper.getStartDateByUserIndex(userIndex);
	}
	
}
