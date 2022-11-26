package com.amarmittal.blogapp.entities;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document("posts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {

	@Id
	int postId;

	@Indexed(unique = true)
	String title;

	String content;

	String synopsis;

	@DocumentReference(lazy = true)
	User user;

	@DocumentReference(lazy = true)
	Category category;

	@DocumentReference(lazy = true)
	List<Comment> comments;

	String dateTime;

}
