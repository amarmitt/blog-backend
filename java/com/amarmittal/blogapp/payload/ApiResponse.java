package com.amarmittal.blogapp.payload;

import org.springframework.http.HttpStatus;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse {
	boolean success;
	String message;
	HttpStatus status;

	public ApiResponse(boolean success, String message) {
		this.success = success;
		this.message = message;
	}

}
