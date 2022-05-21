package com.wishlist.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wishlist.entity.WishList;

@Repository
public interface WishListRepository extends JpaRepository<WishList, Integer> {
        
	List<WishList> findByUserId(String userId);
	Boolean existsByUserId(String userId);
	
}
