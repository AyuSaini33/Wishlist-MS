package com.wishlist.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.wishlist.dtos.WishListDto;

@Entity
public class WishList {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "wish_list_id")
	private Integer wishListId;
	
	private String userId;
	
	private String productId;
	
	public WishList(String userId, String productId) {
		super();
		this.userId = userId;
		this.productId = productId;
	}	
	
	public WishList(Integer wishListId, String userId, String productId) {
		super();
		this.wishListId = wishListId;
		this.userId = userId;
		this.productId = productId;
	}
	
	

	public WishList() {
		super();
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
	
	
	
	 public Integer getWishListId() {
		return wishListId;
	}

	public void setWishListId(Integer wishListId) {
		this.wishListId = wishListId;
	}

	public static WishListDto prepareWishListDto(WishList wishList) {
		WishListDto wishListDto = new WishListDto(wishList.getWishListId(), wishList.getUserId(), wishList.getProductId());
		return wishListDto;
	}
	
}
