package com.coforge.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandlerClass {
	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<String> handleCustomerNotFoundException(CustomerNotFoundException e){
//		ErrorResponse errorResponse = new ErrorResponse(LocalDateTime.now(),HttpStatus.NOT_FOUND.value(),"NOT_FOUND",e.getMessage());
//		return new ResponseEntity<>(errorResponse,HttpStatus.NOT_FOUND);
//		return new ResponseEntity<>("Customer not found",HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
	}
}
