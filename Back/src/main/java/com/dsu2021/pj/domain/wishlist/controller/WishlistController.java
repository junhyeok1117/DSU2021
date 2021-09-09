package com.dsu2021.pj.domain.wishlist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dsu2021.pj.domain.wishlist.dto.WishlistDTO;
import com.dsu2021.pj.domain.wishlist.service.WishlistService;


@CrossOrigin(origins="*")
@RestController
public class WishlistController { // 위시리스트 이름을 테이블로 따로 뺄 필요가 있음
	
	@Autowired
	private WishlistService service;
	
	
	//GET
	@GetMapping("/users/{userIndex}/wishlists")
    public ResponseEntity<?> getWishlistsByUserIndex(@PathVariable Long userIndex){
        
		List<WishlistDTO.WishlistRes> wishlists = service.getWishlistsByUserIndex(userIndex);
		
		
		return new ResponseEntity<>(wishlists,HttpStatus.OK);
    }
	
	@GetMapping("/users/{userIndex}/wishlists/name/{wishlistName}")
	public ResponseEntity<?> getWishlistsByUserIndexAndWishlistName(@PathVariable Long userIndex,@PathVariable String wishlistName){
		
		List<WishlistDTO.WishlistRes> wishlists = service.getWishlistsByUserIndexAndWishlistName(userIndex,wishlistName);
		
		return new ResponseEntity<>(wishlists,HttpStatus.OK);
	}
	
	
	//POST
	
	
}
