package com.wishlist.dtos;

import com.wishlist.entity.WishList;

public class WishListDto {

	private Integer wishId;
	private String userId;
	private String productId;
	
	
	
	public WishListDto(Integer wishId, String userId, String productId) {
		super();
		this.wishId = wishId;
		this.userId = userId;
		this.productId = productId;
	}
	
	
	
	public WishListDto() {
		super();
	} 

	public Integer getWishId() {
		return wishId;
	}
	public void setWishId(Integer wishId) {
		this.wishId = wishId;
	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public static WishList prepareWishListEntity(WishListDto wishListDto) {
		WishList wishList = new WishList(wishListDto.userId , wishListDto.productId);
		return wishList;
	}
	
	
}
