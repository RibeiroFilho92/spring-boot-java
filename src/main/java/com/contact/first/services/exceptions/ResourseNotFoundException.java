package com.contact.first.services.exceptions;

public class ResourseNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResourseNotFoundException(Object ID) {
		super("Resource not found. ID = " + ID);
	}
}
