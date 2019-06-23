package com.example.CalenderAppDemo.DTO;

import java.time.Instant;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@JsonInclude(Include.NON_NULL)
public class BaseDTO {
	
	private UUID id;
	private Instant eventCreateDate;
	private Instant eventUpdateDate;
	private String createdBy;
	private String updatedBy;
	public Instant getEventCreateDate() {
		return eventCreateDate;
	}
	public void setEventCreateDate(Instant eventCreateDate) {
		this.eventCreateDate = eventCreateDate;
	}
	public Instant getEventUpdateDate() {
		return eventUpdateDate;
	}
	public void setEventUpdateDate(Instant eventUpdateDate) {
		this.eventUpdateDate = eventUpdateDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

}
