package com.amarmittal.blogapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.amarmittal.blogapp.entities.Role;

public interface RoleRepository extends MongoRepository<Role, Integer> {
	Role findTopByOrderByRoleIdDesc();
}
