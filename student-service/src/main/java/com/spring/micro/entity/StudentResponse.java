package com.spring.micro.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponse {

	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private AddressResponse addressResponse;
}
