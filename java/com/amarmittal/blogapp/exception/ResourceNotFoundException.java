package com.amarmittal.blogapp.exception;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ResourceNotFoundException extends RuntimeException {

	/**
	 *
	 */
	private static final long serialVersionUID = -7773006085542469675L;

	final String resourceName;
	final String filedName;
	final Object fieldValue;

	public ResourceNotFoundException(String resourceName, String filedName, Object fieldValue) {
		super();
		this.resourceName = resourceName;
		this.filedName = filedName;
		this.fieldValue = fieldValue;
	}

}
