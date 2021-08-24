package com.dsu2021.pj.domain.wishlist;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Alias("wishlistDTO")// RoomMapper.xml에서 쓰기 위한 별명 지정
@Setter
@Getter
public class WishlistDTO {
	
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class WishlistRes{
		private Long roomIndex;
		private Long userIndex;
		private String wishlistName;
	}
	

}
