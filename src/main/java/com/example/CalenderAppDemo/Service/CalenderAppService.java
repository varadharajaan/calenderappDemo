package com.example.CalenderAppDemo.Service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import com.example.CalenderAppDemo.DTO.CalenderAppDTO;
import com.example.CalenderAppDemo.DTO.IdDTO;

public interface CalenderAppService {

	IdDTO createEvent(@Valid CalenderAppDTO calenderAppDTO);

	CalenderAppDTO updateEvent(@Valid CalenderAppDTO calenderAppDTO);

	List<CalenderAppDTO> getEvents(@Valid UUID memberId);

	List<CalenderAppDTO> getAllEvents();

	String deleteEvent(@Valid UUID eventId);

	
}
