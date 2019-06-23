package com.example.CalenderAppDemo.DTO;

import java.time.Instant;
import java.util.List;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * 
 * @author varadharajan
 *
 */
/*
 * calenderDTO to get values from consumer and update in DB
 * also send values to consumer in GET API
 */
@JsonInclude(Include.NON_NULL)
public class CalenderAppDTO  extends BaseDTO{
	
	
	@NotNull
	@Size(max=35)
    private String owner;
    @Column(length = 35)
    private String location;
    private List<String> users;
    @NotNull
	@Size(max=35)
    private String title;
    @NotNull
    private Instant startTime;
    @NotNull
    private Instant endTime;
    @NotNull
    @Size(max=10)
    private String response;
    
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<String> getUsers() {
		return users;
	}
	public void setUsers(List<String> users) {
		this.users = users;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Instant getStartTime() {
		return startTime;
	}
	public void setStartTime(Instant startTime) {
		this.startTime = startTime;
	}
	public Instant getEndTime() {
		return endTime;
	}
	public void setEndTime(Instant endTime) {
		this.endTime = endTime;
	}
	
	// overriden to string method to print all values
	@Override
	public String toString() {
		return "CalenderAppDTO [owner=" + owner + ", location=" + location + ", users=" + users + ", title=" + title
				+ ", startTime=" + startTime + ", endTime=" + endTime + ", response=" + response + "]";
	}
    
    

}
