package com.amarmittal.blogapp.exception;

public class BadRequestException extends RuntimeException {

	/**
	 *
	 */
	private static final long serialVersionUID = 5807151280967447029L;

	public BadRequestException(String message) {
		super(message);
	}

	public BadRequestException(String message, Throwable cause) {
		super(message, cause);
	}
}
