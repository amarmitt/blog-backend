package com.amarmittal.blogapp.util;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class Mapper {

	private final ModelMapper modelMapper;

	public <S, D> D map(S source, Class<D> destinationType) {
		return this.modelMapper.map(source, destinationType);
	}

}
