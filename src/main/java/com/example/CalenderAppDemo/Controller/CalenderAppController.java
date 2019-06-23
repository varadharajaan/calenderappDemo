package com.example.CalenderAppDemo.Controller;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.CalenderAppDemo.DTO.CalenderAppDTO;
import com.example.CalenderAppDemo.DTO.IdDTO;
import com.example.CalenderAppDemo.Service.CalenderAppService;

@RestController
@RequestMapping("/eventManagement/v1")
public class CalenderAppController {
	
	@Autowired
	public CalenderAppService calenderAppService;
	
	private static final Logger logger = LoggerFactory.getLogger(CalenderAppController.class);
	
	@ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/createEvent")
	public ResponseEntity<IdDTO> createCalenderEvent(@Valid @RequestBody CalenderAppDTO calenderAppDTO) {
		
		IdDTO idDto = calenderAppService.createEvent(calenderAppDTO);
		return new ResponseEntity<>(idDto, HttpStatus.CREATED);
	}
	
	@ResponseStatus(HttpStatus.OK)
    @PutMapping("/updateEvent")
	public ResponseEntity<CalenderAppDTO> updateCalenderEvent(final @Valid @RequestBody CalenderAppDTO calenderAppDTO) {
		
		CalenderAppDTO updatedDto = calenderAppService.updateEvent(calenderAppDTO);
		logger.debug("updatedDto value-->"+updatedDto.toString());
		return new ResponseEntity<>(updatedDto, HttpStatus.OK);
	}
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping("/{memberId}")
	public ResponseEntity<List<CalenderAppDTO>> getCalenderEvents(final @Valid @PathVariable UUID memberId) {
		
		List<CalenderAppDTO> events = calenderAppService.getEvents(memberId);
		return new ResponseEntity<>(events, HttpStatus.OK);
	}
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping
	public ResponseEntity<List<CalenderAppDTO>> getAllCalenderEvents() {
		
		List<CalenderAppDTO> events = calenderAppService.getAllEvents();
		return new ResponseEntity<>(events, HttpStatus.OK);
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{eventId}")
	public ResponseEntity<String> updateCalenderEvent(final @Valid @PathVariable UUID eventId) {
		String value = calenderAppService.deleteEvent(eventId);
		return new ResponseEntity<>(value, HttpStatus.NO_CONTENT);
	}
	
	

}
