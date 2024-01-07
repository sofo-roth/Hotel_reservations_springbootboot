package com.project.Hotel_reservations_app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="my_reservations")
public class User {
	
	@Id
	private int id;
	private String name;
	private String surname;
	private String phone_number;
	private String address;
	private String city;
	private String country;
	private String language;
	public User(int id, String name, String surname, String phone_number, String address, String city,
			String country, String language) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.phone_number = phone_number;
		this.address = address;
		this.city = city;
		this.country = country;
		this.language = language;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Long id2, String name2, String surname2, String phone_number2, String address2, String city2,
			String country2, String language2) {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
}
