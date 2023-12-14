package com.amazon.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Amazon_Users")
public class UserDetails {

	@Id
	@Column
	private String userName;
	@Column(nullable = false, length = 8)
	private String password;
	@Column(nullable = false, length = 15)
	private String firstName;
	@Column
	private String lastName;
	@Column(nullable = false, unique = true)
	private String gmailId;
	@Column(nullable = false, length = 10)
	private long contactNumber;
	@Column(nullable = false)
	private String gender;
	@Column
	private String address;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

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

	public String getGmailId() {
		return gmailId;
	}

	public void setGmailId(String gmailId) {
		this.gmailId = gmailId;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return userName + "\t" + password + "\t" + firstName + "\t" + lastName + "\t" + gmailId + "\t" + contactNumber
				+ "\r" + gender + "\t" + address;
	}

}
