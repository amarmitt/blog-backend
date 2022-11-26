package com.amarmittal.blogapp.Dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddressDto {

	int addressId;

	String address;

	String city;

	String state;

	String country;

	long pinCode;

	UserDto user;
}
