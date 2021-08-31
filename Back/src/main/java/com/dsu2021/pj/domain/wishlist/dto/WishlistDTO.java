package com.dsu2021.pj.domain.wishlist.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
public class WishlistDTO {
	
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class WishlistReq{
		private Long roomIndex;
		private Long userIndex;
		private String wishlistName;
	}
	

}