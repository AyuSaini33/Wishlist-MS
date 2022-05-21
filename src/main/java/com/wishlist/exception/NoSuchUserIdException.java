package com.wishlist.exception;

public class NoSuchUserIdException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public NoSuchUserIdException() {
		super();
	}
	public NoSuchUserIdException(String errors) {
		super(errors);
	}
}
