package com.wishlist.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.wishlist.dtos.ErrorMessage;

@RestControllerAdvice
public class ExceptionControllerAdvice {

	@ExceptionHandler(NoSuchWishIdException.class)
	public ResponseEntity<ErrorMessage> wishIdException(NoSuchWishIdException ex) {
		ErrorMessage error = new ErrorMessage();
		error.setErrorCode(HttpStatus.BAD_GATEWAY.value());
		error.setMessage(ex.getMessage());
	      return new ResponseEntity<ErrorMessage>(error , HttpStatus.OK);	
	}
	
	
	@ExceptionHandler(NoSuchUserIdException.class)
	public ResponseEntity<ErrorMessage> userIdException(NoSuchUserIdException ex) {
		ErrorMessage error = new ErrorMessage();
		error.setErrorCode(HttpStatus.BAD_GATEWAY.value());
		error.setMessage(ex.getMessage());
	      return new ResponseEntity<ErrorMessage>(error , HttpStatus.OK);	
	}
	
	
	
	
}
