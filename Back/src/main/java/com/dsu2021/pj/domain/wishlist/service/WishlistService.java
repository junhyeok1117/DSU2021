package com.dsu2021.pj.domain.wishlist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsu2021.pj.domain.wishlist.dto.WishlistDTO;
import com.dsu2021.pj.domain.wishlist.repository.WishlistMapper;

@Service
public class WishlistService {

	@Autowired
	private WishlistMapper wishlistMapper;

	public List<WishlistDTO.WishlistRes> getWishlistsByUserIndex(Long userIndex){
		
		return wishlistMapper.getWishlistsByUserIndex(userIndex);
	}
	

	public List<WishlistDTO.WishlistRes> getWishlistsByUserIndexAndWishlistName(Long userIndex, String wishlistName){
		
		
		return wishlistMapper.getWishlistsByUserIndexAndWishlistName(userIndex, wishlistName);
	}
	
	
}
