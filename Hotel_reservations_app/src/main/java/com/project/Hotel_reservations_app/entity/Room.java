package com.project.Hotel_reservations_app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="rooms_list")
public class Room {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String room_name;
	private String description;
	private String type;
	private float price;
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Room(int id, String room_name, String description, String type, float price, float square_meters) {
		super();
		this.id = id;
		this.room_name = room_name;
		this.description = description;
		this.type = type;
		this.price = price;
		this.square_meters = square_meters;
	}
	private float square_meters;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRoom_name() {
		return room_name;
	}
	public void setRoom_name(String room_name) {
		this.room_name = room_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getSquare_meters() {
		return square_meters;
	}
	public void setSquare_meters(float square_meters) {
		this.square_meters = square_meters;
	}
}
