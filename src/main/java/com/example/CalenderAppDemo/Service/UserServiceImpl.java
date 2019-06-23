package com.example.CalenderAppDemo.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CalenderAppDemo.DTO.IdDTO;
import com.example.CalenderAppDemo.DTO.UserInputDTO;
import com.example.CalenderAppDemo.entity.User;
import com.example.CalenderAppDemo.repository.UserRepository;


import org.apache.commons.beanutils.BeanUtils;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public IdDTO createUser(@Valid UserInputDTO dto) {
		
		User user = new User();
		try {
			BeanUtils.copyProperties(user, dto);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		System.out.println("USer details-->"+user.toString());
		
		userRepository.save(user);
		return new IdDTO(user.getId());
		
	}

	@Override
	public List<User> getUsers(UUID eventId) {
		return userRepository.findAll();
	}

}
