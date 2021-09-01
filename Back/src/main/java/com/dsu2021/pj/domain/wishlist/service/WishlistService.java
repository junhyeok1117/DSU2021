package com.dsu2021.pj.domain.wishlist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsu2021.pj.domain.wishlist.repository.WishlistMapper;

@Service
public class WishlistService {

	@Autowired
	private WishlistMapper wishlistMapper;

	
}
