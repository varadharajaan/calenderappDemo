package com.example.CalenderAppDemo.Service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.CalenderAppDemo.Controller.CalenderAppController;
import com.example.CalenderAppDemo.DTO.CalenderAppDTO;
import com.example.CalenderAppDemo.DTO.IdDTO;
import com.example.CalenderAppDemo.entity.CalenderApp;
import com.example.CalenderAppDemo.entity.User;
import com.example.CalenderAppDemo.exception.ValueNotFoundException;
import com.example.CalenderAppDemo.repository.CalenderAppRepository;
import com.example.CalenderAppDemo.repository.UserRepository;

@Component
public class CalenderAppServiceImpl implements CalenderAppService {
	
	@Autowired
	private CalenderAppRepository calenderAppRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	private static final Logger logger = LoggerFactory.getLogger(CalenderAppController.class);

	@Override
	public IdDTO createEvent(final @Valid CalenderAppDTO dto) {
		
		CalenderApp events = new CalenderApp();
		final Instant now = Instant.now();
		final List<User> users = new ArrayList<>();
		events.setCreatedAt(now);
		events.setTitle(dto.getTitle());
		events.setLocation(dto.getLocation());
		final User owner = userRepository.findByEmailIgnoreCase(dto.getOwner()).orElseThrow(
                () -> new ValueNotFoundException("user not found"));
		events.setOwner(owner);
		events.setResponse(dto.getResponse());
		events.setStartTime(dto.getStartTime());
		events.setEndTime(dto.getEndTime());
		events.setResponse(dto.getResponse());
		for (String email : dto.getUsers()) {
			final User assignedUsers = userRepository.findByEmailIgnoreCase(email).orElseThrow(
	                () -> new ValueNotFoundException("user not found"));
			users.add(assignedUsers);
		}
		events.setUsers(users);
		calenderAppRepository.save(events);
		logger.debug("create sucess");
		 return  new IdDTO(events.getId());
	}

	@Override
	public CalenderAppDTO updateEvent(final @Valid CalenderAppDTO dto) {
		
		CalenderApp events = new CalenderApp();
		final Instant now = Instant.now();
		final List<User> users = new ArrayList<>();
		events.setCreatedAt(now);
		events.setTitle(dto.getTitle());
		events.setLocation(dto.getLocation());
		final User owner = userRepository.findByEmailIgnoreCase(dto.getOwner()).orElseThrow(
                () -> new ValueNotFoundException("user not found"));
		events.setOwner(owner);
		events.setResponse(dto.getResponse());
		events.setStartTime(dto.getStartTime());
		events.setEndTime(dto.getEndTime());
		events.setResponse(dto.getResponse());
		for (String email : dto.getUsers()) {
			final User assignedUsers = userRepository.findByEmailIgnoreCase(email).orElseThrow(
	                () -> new ValueNotFoundException("user not found"));
			users.add(assignedUsers);
		}
		events.setUsers(users);
		CalenderApp calenderApp=  calenderAppRepository.save(events);
		CalenderAppDTO appDTO = new CalenderAppDTO();
		appDTO.setTitle(calenderApp.getTitle());
		appDTO.setResponse(calenderApp.getResponse());
		logger.debug("update success");
		return appDTO;
		
	}

	@Override
	public List<CalenderAppDTO> getEvents(final @Valid UUID memberId) {
		return null;
	}

	@Override
	public List<CalenderAppDTO> getAllEvents() {
		return null;
	}

	@Override
	public String deleteEvent(@Valid UUID eventId) {
		return null;
	}

}
