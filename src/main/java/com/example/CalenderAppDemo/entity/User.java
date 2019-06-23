package com.example.CalenderAppDemo.entity;


import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "\"user\"")
public class User extends BaseEntity {

    @Column(length = 30)
    private String firstName;
    @Column(length = 30)
    private String lastName;
    @Column(nullable = false, unique = true, length = 100)
    private String email;
    @Column(length = 30)
    private String phoneNumber;
    private Instant lastLogin;
    private boolean active = true;

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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

	public Instant getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Instant lastLogin) {
		this.lastLogin = lastLogin;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", lastLogin=" + lastLogin + ", active=" + active + "]";
	}
    
	
    

}
