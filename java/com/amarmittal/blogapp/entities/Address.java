package com.amarmittal.blogapp.entities;

import org.springframework.data.annotation.Id;

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
public class Address {

	@Id
	int addressId;

	String address;

	String city;

	String state;

	String country;

	long pinCode;

	User user;
}
