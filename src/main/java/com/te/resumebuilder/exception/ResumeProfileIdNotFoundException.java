package com.te.resumebuilder.exception;

public class ResumeProfileIdNotFoundException extends RuntimeException {

	private String message;

	public ResumeProfileIdNotFoundException(String message) {
		super(message);
	}

}
