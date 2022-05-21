package com.wishlist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wishlist.dtos.Response;
import com.wishlist.dtos.WishListDto;
import com.wishlist.entity.WishList;
import com.wishlist.exception.NoSuchUserIdException;
import com.wishlist.exception.NoSuchWishIdException;
import com.wishlist.service.WishListService;

@RestController
@RequestMapping("/wishlist")
public class WishListController {
    
	@Autowired
	WishListService wishListService;
	
	@PostMapping(consumes = "application/json" , value = "/additem")
	String addItemToWishList(@RequestBody WishListDto wishListDto){
		wishListService.addItemToWishList(wishListDto);
		return "success";
//		return new ResponseEntity<>(null);
	}
	
	@GetMapping(value = "/getitemslist/{id}")
	List<WishListDto> getWishListItem(@PathVariable("id") String userId) throws NoSuchUserIdException{
		List<WishListDto> listOfItems = wishListService.getWishListItem(userId);
//		return new ResponseEntity<>(null);
		return listOfItems;
	}
	
	@DeleteMapping(value = "/deleteitem/{id}")
	String deleteWishListItem(@PathVariable("id") Integer wishListId) throws NoSuchWishIdException{
		wishListService.deleteWishListItem(wishListId);
		return "success message";
	}
	
	
}
