package com.amarmittal.blogapp.services;

import java.util.List;

import com.amarmittal.blogapp.Dto.UserDto;

public interface UserService {
	List<UserDto> getAllUsers();

	UserDto getUserById(int userId);

	UserDto createUser(UserDto userDto);

	int updateUser(int UserId);

	int deleteUser(int UserId);
}
