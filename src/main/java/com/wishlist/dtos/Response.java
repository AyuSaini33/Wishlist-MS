package com.wishlist.dtos;

import java.util.List;

import com.wishlist.constants.ResponseCode;

public class Response {
	  List<WishListDto> listOfItems;
      ResponseCode responseCode;
      String errorCode;
}
