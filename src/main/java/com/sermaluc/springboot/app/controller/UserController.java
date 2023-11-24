package com.sermaluc.springboot.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sermaluc.springboot.app.dto.UserResponseDTO;
import com.sermaluc.springboot.app.entity.User;
import com.sermaluc.springboot.app.service.IUserService;

@RestController
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	
	@PostMapping("/create")
    public ResponseEntity<?> createUser(@RequestBody User user) {
        User savedUser = userService.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
    }
	
	
	/*
	@PostMapping("/create")
	public ResponseEntity<UserResponseDTO> createUser(@RequestBody User user) {
        User savedUser = userService.save(user);
        
        UserResponseDTO response = new UserResponseDTO();
        response.setId(savedUser.getId());
        response.setCreated(savedUser.getCreated());
        response.setModified(savedUser.getModified());
        response.setActive(savedUser.isIsactive());
        response.setToken(savedUser.getToken());
        response.setLastLogin(savedUser.getLastLogin());
        
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    */

}
