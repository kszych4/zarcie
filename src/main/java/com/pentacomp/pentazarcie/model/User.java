package com.pentacomp.pentazarcie.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

/**
 * @author Krzysztof Karnaszewski, Pentacomp Systemy Informatyczne S.A.
 */
@Document(collection = "users")
public class User {

	@Id
	private String id;

	private String login;
	@Field("name")
	private String firstName;
	@Field("surname")
	private String lastName;

	@Field("insert_date")
	private Date createDate;

	@Field("update_date")
	private Date updateDate;

	public User(String login, String firstName, String lastName) {
		this.login = login;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
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

	@Override
	public String toString() {
		return "User{" +
				"id='" + id + '\'' +
				", login='" + login + '\'' +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				'}';
	}
}
