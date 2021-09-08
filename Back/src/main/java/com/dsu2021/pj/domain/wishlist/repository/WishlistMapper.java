package com.dsu2021.pj.domain.wishlist.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.dsu2021.pj.domain.wishlist.dto.WishlistDTO;

@Mapper
@Repository
public interface WishlistMapper {
	
//	READ
	public List<WishlistDTO.WishlistRes> getWishlistsByUserIndex(Long userIndex);
	
	public List<WishlistDTO.WishlistRes> getWishlistsByUserIndexAndWishlistName(Long userIndex, String wishlistName);
	
	
//	CRATE
}
