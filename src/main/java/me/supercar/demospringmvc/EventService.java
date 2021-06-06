package me.supercar.demospringmvc;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EventService {
	
	public List<Event> getEvents() {
		
		Event event1 = new Event();
		event1.setName("스프링 웹 MVC 스터디 1차");
		event1.setLimitOfEnrollment(5);
		event1.setStartDateTime(LocalDateTime.of(2021, 5, 2, 14, 0));
		event1.setEndDateTime(LocalDateTime.of(2021, 5, 2, 16, 0));
		
		Event event2 = new Event();
		event2.setName("스프링 웹 MVC 스터디 2차");
		event2.setLimitOfEnrollment(5);
		event2.setStartDateTime(LocalDateTime.of(2021, 5, 3, 14, 0));
		event2.setEndDateTime(LocalDateTime.of(2021, 5, 3, 16, 0));
		
		return List.of(event1, event2);
	}
}
