package com.amarmittal.blogapp.entities;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "authors")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Category {

	@Id
	int authorId;

	String name;

	String url;

	String email;

	@DBRef(lazy = true)
	List<Post> post;

}
