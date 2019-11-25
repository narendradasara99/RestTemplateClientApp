package com.nare.service;

import lombok.Data;

@Data
public class Employee {
	private Integer id;
	private String name;
	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Employee() {
		super();
	}
	

}
