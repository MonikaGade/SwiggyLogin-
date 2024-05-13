package com.dao;

public class DetailsOfModel {
	private String firstName;
	private String surName;
	private String email;
	private String password;
	private String dob;
	private String gender;
	public DetailsOfModel() {
		super();
	}
	public DetailsOfModel( String firstName, String surName, String email, String password, String dob,
			String gender) {
		System.out.println("all");
		System.out.println(firstName);
		this.firstName = firstName;
		this.surName = surName;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.gender = gender;
		
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "DetailsOfModel [ firstName=" + firstName + ", surName=" + surName + ", email=" + email
				+ ", password=" + password + ", dob=" + dob + ", gender=" + gender + "]";
	}
	
}
