package com.cg.CustomerSpringBootJpa.exceptions;

public class InvalidArgumentException extends RuntimeException {
	public InvalidArgumentException() {

	}

	public InvalidArgumentException(String msg) {
		super(msg);
	}

}
