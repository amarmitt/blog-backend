package com.amarmittal.blogapp.Dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class PhotoDto {

	int photoId;

	String title;

	String url;

	String thumbnilUrl;

	AlbumDto album;
}
