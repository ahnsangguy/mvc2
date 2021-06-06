package me.supercar.demospringmvc;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Event {

	private String name;

	private int limitOfEnrollment;

	private LocalDateTime startDateTime;

	private LocalDateTime endDateTime;
}
