package com.project.Hotel_reservations_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Hotel_reservations_app.entity.User;
import com.project.Hotel_reservations_app.repository.MyReservationRepository;

@Service
public class MyReservationService {
	
	@Autowired
	private MyReservationRepository my_reservation;
	
	public void saveMyReservation(User res) {
		my_reservation.save(res);
	}
	
	public List<User> getMyReservation(){
		return my_reservation.findAll();
	}
	
	public void deleteById(int id) {
		my_reservation.deleteById(id);
	}
}
