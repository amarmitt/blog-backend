package com.amarmittal.blogapp.services.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amarmittal.blogapp.Dto.UserDto;
import com.amarmittal.blogapp.entities.Role;
import com.amarmittal.blogapp.entities.User;
import com.amarmittal.blogapp.exception.BadRequestException;
import com.amarmittal.blogapp.repository.RoleRepository;
import com.amarmittal.blogapp.repository.UserRepository;
import com.amarmittal.blogapp.services.UserService;
import com.amarmittal.blogapp.util.Mapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
@Transactional
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;
	private final RoleRepository roleRepository;
	private final Mapper mapper;

	@Override
	public List<UserDto> getAllUsers() {
		List<User> users = userRepository.findAll();

		List<UserDto> usersDto = users.stream().map(user -> mapper.map(user, UserDto.class))
				.collect(Collectors.toList());

		return usersDto;
	}

	@Override
	public UserDto getUserById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto createUser(UserDto userDto) {
		log.info("Create User..." + userDto);
		User user = mapper.map(userDto, User.class);
		if (userRepository.existsByUserName(user.getUserName())) {
			throw new BadRequestException("UserName is already Exist");
		}

		if (userRepository.existsByEmail(user.getEmail())) {
			throw new BadRequestException("Email is already Exist");
		}
		User lastUser = userRepository.findTopByOrderByUserIdDesc();
		if (lastUser != null) {
			int id = lastUser.getUserId();
			user.setUserId(id + 1);
		}
		for (Role role : user.getRoles()) {
			Role lastrole = roleRepository.findTopByOrderByRoleIdDesc();
			if (lastUser != null) {
				int id = lastrole.getRoleId();
				role.setRoleId(id + 1);
			}
		}
		roleRepository.saveAll(user.getRoles());
		userRepository.save(user);

		return mapper.map(user, UserDto.class);
	}

	@Override
	public int updateUser(int UserId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUser(int UserId) {
		// TODO Auto-generated method stub
		return 0;
	}
}
