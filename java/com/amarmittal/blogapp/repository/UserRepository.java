package com.amarmittal.blogapp.repository;

import java.util.Optional;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.amarmittal.blogapp.entities.User;
import com.amarmittal.blogapp.exception.ResourceNotFoundException;

@Repository
public interface UserRepository extends MongoRepository<User, Integer> {

	User findTopByOrderByUserIdDesc();

	Optional<User> findByUserName(@NotBlank String userName);

	Optional<User> findByEmail(@NotBlank String email);

	Boolean existsByUserName(@NotBlank String userName);

	Boolean existsByEmail(@NotBlank String email);

	Optional<User> findByUserNameOrEmail(String userName, String email);

	default User getUserByName(String userName) {
		return findByUserName(userName).orElseThrow(() -> new ResourceNotFoundException("User", "userName", userName));
	}
}
