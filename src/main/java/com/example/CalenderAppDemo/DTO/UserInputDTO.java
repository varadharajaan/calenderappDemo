package com.example.CalenderAppDemo.DTO;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserInputDTO extends BaseDTO {
	
	@NotNull(message="cannot be null")
	@Size(max=30,message="cannot be more than 30")
	private String firstName;
	@NotNull(message="cannot be null")
	@Size(max=30,message="cannot be more than 30")
	private String lastName;
	@NotNull(message="cannot be null")
	@Size(max=30,message="cannot be more than 30")
	private String email;
	private String phoneNumber;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "UserInputDTO [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phoneNumber="
				+ phoneNumber + "]";
	}
	
	

}
