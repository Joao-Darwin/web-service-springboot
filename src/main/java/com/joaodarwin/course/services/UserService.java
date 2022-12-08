package com.joaodarwin.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaodarwin.course.entities.User;
import com.joaodarwin.course.repositories.UserRepository;
import com.joaodarwin.course.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User user) {
		return userRepository.save(user);
	}
	
	public void delete(Long id) {
		userRepository.deleteById(id); 
	}
	
	public User update(Long id, User user) {
		User entity = userRepository.getReferenceById(id);
		updateDate(entity, user);
		return userRepository.save(entity);
	}
	
	private void updateDate(User entity, User user) {
		entity.setName(user.getName());
		entity.setEmail(user.getEmail());
		entity.setPhone(user.getPhone());
	}
	
}
