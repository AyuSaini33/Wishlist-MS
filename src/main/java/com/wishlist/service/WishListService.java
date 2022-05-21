package com.wishlist.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.wishlist.dtos.WishListDto;
import com.wishlist.entity.WishList;
import com.wishlist.exception.NoSuchUserIdException;
import com.wishlist.exception.NoSuchWishIdException;
import com.wishlist.repository.WishListRepository;

@Service
public class WishListService {
       
	@Autowired
	WishListRepository wishListRepository;
	
	public void addItemToWishList(WishListDto wishListDto){
		WishList wishList = WishListDto.prepareWishListEntity(wishListDto);
		wishListRepository.save(wishList);
	}
	
	public List<WishListDto> getWishListItem(String userId) throws NoSuchUserIdException{
		if(!wishListRepository.existsByUserId(userId)) {
			throw new NoSuchUserIdException("UserId doesn't exist");
		}
		List<WishList> listOfitems = wishListRepository.findByUserId(userId);
		List<WishListDto> listOfitemsdto = new ArrayList<>();
		System.out.println(listOfitems.get(0).getWishListId()); 
		listOfitems.forEach(item -> listOfitemsdto.add(WishList.prepareWishListDto(item)));
		return listOfitemsdto;
	}
	
	public void deleteWishListItem(Integer wishListId) throws NoSuchWishIdException{
		
		if(!wishListRepository.existsById(wishListId)) {
			throw new NoSuchWishIdException("wishId doesn't exist");
		}
		wishListRepository.deleteById(null);
	}
	
	
	
}
