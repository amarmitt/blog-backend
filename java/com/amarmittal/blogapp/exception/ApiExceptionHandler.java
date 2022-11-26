package com.amarmittal.blogapp.exception;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@ResponseBody
public class ApiExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, String>> handleMethodArgsNotValidException(MethodArgumentNotValidException ex) {
		Map<String, String> map = new HashMap<>();
		ex.getBindingResult().getAllErrors().forEach(error -> {
			map.put(((FieldError) error).getField(), error.getDefaultMessage());
		});
		return new ResponseEntity<Map<String, String>>(map, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(BadRequestException.class)
	public ResponseEntity<ApiError> handleApiRequestHandler(BadRequestException e) {
		HttpStatus badRequest = HttpStatus.BAD_REQUEST;
		ApiError apiError = new ApiError(e.getMessage(), badRequest, ZonedDateTime.now(ZoneId.of("A")));
		return new ResponseEntity<>(apiError, badRequest);
	}

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiError> handleResourceNotFoundException(ResourceNotFoundException e) {
		HttpStatus notFound = HttpStatus.NOT_FOUND;
		String message = String.format("%s Not found with %s: %s", e.getResourceName(), e.getFiledName(),
				e.getFieldValue());
		ApiError apiError = new ApiError(message, notFound, ZonedDateTime.now(ZoneId.of("A")));
		return new ResponseEntity<>(apiError, notFound);
	}

}
