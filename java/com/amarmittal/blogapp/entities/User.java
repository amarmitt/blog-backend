package com.amarmittal.blogapp.entities;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Document(collection = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

	@Id
	int userId;

	String firstName;

	String lastName;

	String userName;

	String email;

	String password;

	String phoneNumber;

	@DocumentReference(lazy = true)
	Address address;

	@DocumentReference
	List<Role> roles;

	@DocumentReference(lazy = true)
	List<Comment> comments;

	@DocumentReference(lazy = true)
	List<Album> album;

	@DocumentReference(lazy = true)
	List<Post> posts;

}
