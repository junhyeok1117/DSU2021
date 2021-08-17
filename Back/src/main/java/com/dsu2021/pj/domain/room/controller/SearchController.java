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
	
	
	
	
	@GetMapping("/rooms/categories/locations/{location}")
    public ResponseEntity rcl(@PathVariable("location") String location){
//    	SearchedRoomDTO[] a = {
//    			SearchedRoomDTO.builder()
//    			.room_index(45l)
//    			.build()
//    	};
    			//(1,new String[]{"http://192.168.64.9/image/w.png","http://192.168.64.9/images/토마토.jpg","http://192.168.64.9/image/팬션1.jpg"},si_dos,"펜션","좋은 집",3,"l",4.23f,231,false),
    			//new SearchedRoomDTO(1,new String[]{"http://192.168.64.9/image/w.png","http://192.168.64.9/images/토마토.jpg","http://192.168.64.9/image/팬션1.jpg"},si_dos,"펜션","좋은 집",3,"l",4.23f,231,false)};
        return new ResponseEntity<>(null);
    }
	
	@GetMapping("/rooms/categories/kinds/{kind}")
    public ResponseEntity rck(@PathVariable("kind") String kind){
        return new ResponseEntity<>(null);
    }
	
	@GetMapping("/rooms/si-dos/{si_do}")
    public ResponseEntity rs(@PathVariable("si_do") String si_do){
        return new ResponseEntity<>(null);
    }
	
	@GetMapping("/rooms/si-dos/{si_do}/si-gun-gu/{si_gun_gu}")
    public ResponseEntity rss(@PathVariable("si_do") String si_do, @PathVariable("si_gun_gu") String si_gun_gu){
        return new ResponseEntity<>(null);
    }
	
	@GetMapping("/rooms/si-dos/{si_do}/check-in-date/{check_in_date}/check-out-date/{check_out_date}")
    public ResponseEntity rscc(@PathVariable("si_do") String si_do, @PathVariable("check_in_date") String check_in_date, @PathVariable("check_out_date") String check_out_date){
        return new ResponseEntity<>(null);
    }
	
	@GetMapping("/rooms/si-dos/{si_do}/si-gun-gu/{si_gun_gu}/check-in-date/{check_in_date}/check-out-date/{check_out_date}")
    public ResponseEntity rsscc(@PathVariable("si_do") String si_do,@PathVariable("si_gun_gu") String si_gun_gu, @PathVariable("check_in_date") String check_in_date, @PathVariable("check_out_date") String check_out_date){
        return new ResponseEntity<>(null);
    }
	
	@GetMapping("/rooms/si-dos/{si_dos}/adult/{adult}/child/{child}")
	public ResponseEntity rsac(@PathVariable("si_do") String si_do,@PathVariable("adult") String adult,@PathVariable("child") String child) {
        return new ResponseEntity<>(null);
	}
	
	@GetMapping("/rooms/si-dos/{si_do}/si-gun-gu/{si_gun_gu}/adult/{adult}/child/{child}")
	public ResponseEntity rssac(@PathVariable("si_do") String si_do,@PathVariable("si_gun_gu") String si_gun_gu,@PathVariable("adult") String adult,@PathVariable("child") String child) {
        return new ResponseEntity<>(null);
	}
	
	@GetMapping("/rooms/si-dos/{si_do}/check-in-date/{check_in_date}/check-out-date/{check_out_date}/adult/{adult}/child/{child}")
	public ResponseEntity rsccac(@PathVariable("si_do") String si_do,@PathVariable("check_in_date") String check_in_date, @PathVariable("check_out_date") String check_out_date,@PathVariable("adult") String adult,@PathVariable("child") String child) {
        return new ResponseEntity<>(null);
	}
	
	@GetMapping("/rooms/si-dos/{si_do}/si-gun-gu/{si_gun_gu}/check-in-date/{check_in_date}/check-out-date/{check_out_date}/adult/{adult}/child/{child}")
	public ResponseEntity rssccac(@PathVariable("si_do") String si_do,@PathVariable("si_gun_gu") String si_gun_gu,@PathVariable("check_in_date") String check_in_date, @PathVariable("check_out_date") String check_out_date,@PathVariable("adult") String adult,@PathVariable("child") String child) {
        return new ResponseEntity<>(null);
	}
	
	
	
	
	
	
}