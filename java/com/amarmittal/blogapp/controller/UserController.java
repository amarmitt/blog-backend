package com.amarmittal.blogapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.amarmittal.blogapp.Dto.UserDto;
import com.amarmittal.blogapp.services.serviceImpl.UserServiceImpl;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("api/v1/user")
@Slf4j
public class UserController {

	@Autowired
	private UserServiceImpl userServiceImpl;

	@GetMapping("/")
	public String msg() {
		return "Welcome User";
	}

	@PostMapping("/createUser")
	private ResponseEntity<?> createUser(@Valid @RequestBody UserDto userDto) {

		UserDto userDtoResponse = userServiceImpl.createUser(userDto);
		UriComponents uriComponents = UriComponentsBuilder.fromPath("api/v1/user/createUser")
				.buildAndExpand(userDtoResponse);
		return ResponseEntity.created(uriComponents.toUri()).body(userDtoResponse);

	}

}
