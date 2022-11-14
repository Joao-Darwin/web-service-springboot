package com.joaodarwin.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joaodarwin.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResouce {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User user = new User(1L, "Jhon Laurence", "jhon@gmail.com", "88999999999", "123@123");
		return ResponseEntity.ok().body(user);
	}
}
