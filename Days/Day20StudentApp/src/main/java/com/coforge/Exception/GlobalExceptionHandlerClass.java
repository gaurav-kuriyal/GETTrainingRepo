package com.coforge.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandlerClass {
	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<String> handleStudentNotFoundException(StudentNotFoundException e){
		return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(InvalidDateFormatException.class)
	public ResponseEntity<String> handleInvalidDateFormatException(InvalidDateFormatException e){
		return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
	}
}
