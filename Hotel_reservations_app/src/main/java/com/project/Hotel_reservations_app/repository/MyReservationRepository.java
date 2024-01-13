package com.project.Hotel_reservations_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Hotel_reservations_app.entity.User;

@Repository
public interface MyReservationRepository extends JpaRepository<User,Integer> {

}
