package com.project.Hotel_reservations_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Hotel_reservations_app.entity.Customer;
import com.project.Hotel_reservations_app.repository.ReservationRepository;

@Service
public class ReservationService {

	@Autowired
	private ReservationRepository rRepo;
	public void save(Customer r) {
		rRepo.save(r);
	}
	
	public List<Customer> getAllReservations() {
		return rRepo.findAll();
	}
	
	public Customer getReservationById(int id) {
		return  rRepo.findById(id).get();
	}
	
	public void deleteById(int id) {
		rRepo.deleteById(id);
	}
}
