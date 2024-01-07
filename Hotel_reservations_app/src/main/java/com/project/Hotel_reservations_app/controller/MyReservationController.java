package com.project.Hotel_reservations_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.Hotel_reservations_app.entity.User;
import com.project.Hotel_reservations_app.service.MyReservationService;

@Controller
public class MyReservationController {
	
	@Autowired
	private MyReservationService service;
	
	@RequestMapping("/deleteMyList/{id}")
	public String deleteMyList(@PathVariable("id") int id) {
		service.deleteById(id);
		return "redirect:/my_reservation";
	}
	
	@GetMapping("/my_reservation")
	public String getMyReservation(Model model) {
		
		List<User>list=service.getMyReservation();
		model.addAttribute("reservation",list);
		return "my_reservation";
	}
}
