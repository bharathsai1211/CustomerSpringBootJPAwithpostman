package com.cg.CustomerSpringBootJpa.util;

import com.cg.CustomerSpringBootJpa.exceptions.InvalidArgumentException;
import com.cg.CustomerSpringBootJpa.exceptions.InvalidNameException;

public class ValidationUtil {
	public static void checkArgumentNotNull(Object arg) {
		if (arg == null) {
			throw new InvalidArgumentException("arg should not be null");
		}

	}

	public static void checkName(String name) {
		if (name == null || name.isEmpty()) {
			throw new InvalidNameException("name should not be empty");
		}
	}

}
