package com.project.Hotel_reservations_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.Hotel_reservations_app.entity.Customer;

public interface ReservationRepository extends JpaRepository<Customer,Integer>{
	
}