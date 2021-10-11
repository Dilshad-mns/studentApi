package com.example.dilshad.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class Student {
	private final String id = UUID.randomUUID().toString();
	private final String name;
	private final String address;

	
}
