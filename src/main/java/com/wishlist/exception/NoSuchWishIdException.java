package com.wishlist.exception;

public class NoSuchWishIdException extends Exception {
	
	// need to understand mores
	private static final long serialVersionUID = 1L;
	
	public NoSuchWishIdException() {
		super();
	}
	public NoSuchWishIdException(String errors) {
		super(errors);
	}
	
}
