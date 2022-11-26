package com.amarmittal.blogapp.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Document(collection = "photo")
public class Photo {
	
	@Id
	int photoId;

	@Indexed(unique = true)
	String title;
	
	String url;
	
	String thumbnilUrl;
	
	@DocumentReference(lazy = true)
	Album album;
}
