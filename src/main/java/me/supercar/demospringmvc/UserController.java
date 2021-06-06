package me.supercar.demospringmvc;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class UserController {
	
	@GetMapping("/user")
	public String setUser(HttpServletRequest request) {
		
		User user = new User.UserBuilder()
				.id(1L)
				.name("userA")
				.gender("M")
				.age(15)
				.build();
		
		HttpSession session = request.getSession();
		session.setAttribute("user", user);
		
		return "redirect:/user/info";
	}
	
	@GetMapping("/user/info")
	@ResponseBody
	public User setUser(@SessionAttribute("user") User user) {
		
		return user;
	}
	
	@PostMapping("/json")
	public @ResponseBody User jsonTest(@RequestBody User user) {
		
		return user;
	}
}
