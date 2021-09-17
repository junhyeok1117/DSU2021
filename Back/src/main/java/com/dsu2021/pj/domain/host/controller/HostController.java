package com.dsu2021.pj.domain.host.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.dsu2021.pj.domain.host.service.HostService;

@CrossOrigin(origins="*")
@RestController
public class HostController {
	
	@Autowired
	private HostService service;
	
	@GetMapping("/users/{userIndex}/start-date")
    public ResponseEntity<String> getStartDateByUserIndex(@PathVariable("userIndex") Long userIndex){
		return new ResponseEntity<>(service.getStartDateByUserIndex(userIndex),HttpStatus.OK);
    }
	
	

}