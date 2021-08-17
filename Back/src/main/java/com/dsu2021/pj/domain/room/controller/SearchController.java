package com.dsu2021.pj.domain.room.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dsu2021.pj.domain.room.dto.SearchedRoomDTO;

@CrossOrigin(origins="*")
@RestController
public class SearchController {
	
	
	
	
	@GetMapping("/si-dos/{si-dos}")
    public ResponseEntity searchSidos(@PathVariable("si-dos") String si_dos){
    	
    	SearchedRoomDTO[] a = {
    			SearchedRoomDTO.builder()
    			.room_index(45l)
    			.build()
    			
    	
    	};
    	
    	
    	
    			
    			//(1,new String[]{"http://192.168.64.9/image/w.png","http://192.168.64.9/images/토마토.jpg","http://192.168.64.9/image/팬션1.jpg"},si_dos,"펜션","좋은 집",3,"l",4.23f,231,false),
    			//new SearchedRoomDTO(1,new String[]{"http://192.168.64.9/image/w.png","http://192.168.64.9/images/토마토.jpg","http://192.168.64.9/image/팬션1.jpg"},si_dos,"펜션","좋은 집",3,"l",4.23f,231,false)};
    	
	
		
		
        return new ResponseEntity<>(null);
    }
	
	
	
	
}