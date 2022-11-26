package com.amarmittal.blogapp.Dto;

import java.util.List;

import com.amarmittal.blogapp.entities.User;

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
public class AlbumDto {

	int albumId;

	String title;

	List<PhotoDto> photos;

	User user;

}
