package com.gotmail.gotmailapi.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gotmail.gotmailapi.dto.UserDTO;
import com.gotmail.gotmailapi.entities.User;
import com.gotmail.gotmailapi.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	// List all users method
	public List<UserDTO> findAll(){
		
		List<User> result = userRepo.findAll();
		
		return result.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
	}
	
	// Register new user method
	public void register(UserDTO user) {
		
		User newUser = new User(user);
		
		userRepo.save(newUser);
	}
}
