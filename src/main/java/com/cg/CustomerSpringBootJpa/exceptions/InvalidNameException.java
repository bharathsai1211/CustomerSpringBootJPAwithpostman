package com.cg.CustomerSpringBootJpa.exceptions;

public class InvalidNameException extends RuntimeException {
	public InvalidNameException() {

	}

	public InvalidNameException(String msg) {
		super(msg);
	}

}
