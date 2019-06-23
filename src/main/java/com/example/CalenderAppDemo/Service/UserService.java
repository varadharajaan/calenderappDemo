package com.example.CalenderAppDemo.Service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import com.example.CalenderAppDemo.DTO.IdDTO;
import com.example.CalenderAppDemo.DTO.UserInputDTO;
import com.example.CalenderAppDemo.entity.User;

public interface UserService {

	IdDTO createUser(@Valid UserInputDTO dto);

	List<User> getUsers(UUID eventId);

}
