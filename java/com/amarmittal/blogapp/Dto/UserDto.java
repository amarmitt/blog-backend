package com.amarmittal.blogapp.Dto;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

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
public class UserDto {
	int userId;

	@NotBlank(message = "first Name can not be empty")
	@Size(min = 3, max = 15, message = "first Name size must be min 3 and max 10 characters")
	String firstName;

	String lastName;

	@NotBlank(message = "userName cannot be empty")
	@Pattern(regexp = "^[a-zA-Z0-9](_(?!(\\.|_))|\\.(?!(_|\\.))|[a-zA-Z0-9]){6,18}[a-zA-Z0-9]$", message = "userName should be unique")
	String userName;

	@Email(message = "Email is not valid")
	@NotBlank(message = "Email cannot be empty")
	String email;

	@NotBlank(message = "password cannot be empty")
	@Pattern(message = "password should be strong ", regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[^\\da-zA-Z]).{8,15}$")
	String password;

	@NotBlank(message = "phoneNumber cannot be empty")
	@Pattern(message = "phone number is not valid", regexp = "^(?:(?:\\+|0{0,2})91(\\s*[\\ -]\\s*)?|[0]?)?[789]\\d{9}|(\\d[ -]?){10}\\d$")
	String phoneNumber;

	List<RoleDto> roles;
}
