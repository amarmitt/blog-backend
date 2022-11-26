package com.amarmittal.blogapp.entities;

import java.util.List;

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
@Document("Album")
public class Album {

	@Id
	int albumId;
	
	@Indexed(unique= true)
	String title;
	
	@DocumentReference(lazy = true)
	List<Photo> photos;
	
	@DocumentReference(lazy = true)
	User user;
	
}
