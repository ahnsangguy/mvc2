package me.supercar.demospringmvc;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Builder
public class User {
	
	private Long id;
	private String name;
	private String gender;
	private int age;
}
