package com.gotmail.gotmailapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gotmail.gotmailapi.dto.UserDTO;
import com.gotmail.gotmailapi.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<UserDTO>> findAll(){
		
		List<UserDTO> list = service.findAll();
		
		return ResponseEntity.ok(list);
	}
	
	@PostMapping("/register")
	@ResponseBody
	public ResponseEntity<String> register(@RequestBody UserDTO user){
		
		service.register(user);
		
		return ResponseEntity.ok("Usuário registrado com sucesso!");
	}
}
