package com.amarmittal.blogapp.Dto;

import java.util.List;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@NoArgsConstructor
public class CategoryDto {

	int authorId;

	String name;

	String url;

	String email;

	List<PostDto> post;

}
