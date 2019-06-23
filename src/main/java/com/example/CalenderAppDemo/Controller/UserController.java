package com.example.CalenderAppDemo.Controller;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CalenderAppDemo.DTO.IdDTO;
import com.example.CalenderAppDemo.DTO.UserInputDTO;
import com.example.CalenderAppDemo.Service.UserService;
import com.example.CalenderAppDemo.entity.User;

@RestController
@RequestMapping("/userManagement/v1")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/createUser")
	public ResponseEntity<IdDTO> createUser(final @Valid @RequestBody UserInputDTO dto) {
		IdDTO id = userService.createUser(dto);
		
		return  new ResponseEntity<IdDTO>(id, HttpStatus.CREATED);
	}
	@GetMapping("/getUsers/{eventId}")
	public ResponseEntity<List<User>> getUsers(final @Valid @PathVariable UUID eventId) 
	{
		return new ResponseEntity<>(userService.getUsers(eventId),HttpStatus.OK);
	}

}
