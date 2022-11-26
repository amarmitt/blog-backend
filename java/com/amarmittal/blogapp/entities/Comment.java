package com.amarmittal.blogapp.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Document(collection = "Comment")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Comment {
	
	@Id
	int commentId;
	
	String name;
	
	String email;
	
	String comment;

	@DocumentReference(lazy = true)
	Post post;
	
	@DocumentReference( lazy = true)
	User user;
}
