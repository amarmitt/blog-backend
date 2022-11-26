package com.amarmittal.blogapp.Dto;

import com.amarmittal.blogapp.entities.RoleName;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoleDto {

	int roleId;

	RoleName roleName;
}
