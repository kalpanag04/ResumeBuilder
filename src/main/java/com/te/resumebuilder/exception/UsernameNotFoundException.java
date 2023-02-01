package com.te.resumebuilder.exception;

import org.aspectj.lang.annotation.SuppressAjWarnings;

import lombok.experimental.SuperBuilder;

@SuppressAjWarnings("serial")
public class UsernameNotFoundException extends RuntimeException {
	public UsernameNotFoundException(String message) {
		super(message);
	}

}
