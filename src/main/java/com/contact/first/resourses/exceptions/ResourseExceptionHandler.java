package com.contact.first.resourses.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.contact.first.services.exceptions.ResourseNotFoundException;

@ControllerAdvice
public class ResourseExceptionHandler {

	@ExceptionHandler(ResourseNotFoundException.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourseNotFoundException e, HttpServletRequest request) {
		String error = "Resourse not found";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}
}
