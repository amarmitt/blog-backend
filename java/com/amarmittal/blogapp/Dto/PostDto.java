package com.amarmittal.blogapp.Dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostDto {
	int postId;

	String title;

	String content;

	String synopsis;

	CategoryDto author;

	String dateTime;
}
