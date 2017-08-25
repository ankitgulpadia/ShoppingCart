package com.model;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Component
@Entity
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1704379726153417848L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
	private String email;
	private String password;
	private String username;
    private String address;
	private String state;
	//private String role;
	private String gender;
	private boolean Enable=true;

	
		public boolean isEnable() {
		return Enable;
	}
	public void setEnable(boolean enable) {
		Enable = enable;
	}
		public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	/*public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}*/
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
	
	

