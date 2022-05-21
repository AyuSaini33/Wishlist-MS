package com.wishlist.constants;

public enum ResponseCode {
    Success(1), Failure(0);
    private int responseCode;
    ResponseCode(int responseCode){
    	this.responseCode = responseCode;
    }
    
    int getResponseCode() {
    	return responseCode;
    }
    
}