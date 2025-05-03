package com.myapp.dozzy.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(exception = ResourceNotFoundException.class)
	public ResponseEntity<String> resourceNotFound(ResourceNotFoundException exception) {

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
	}

	public ResponseEntity<String> genericException(Exception exception) {
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
				.body("Internal server error: " + exception.getMessage());
	}

}
