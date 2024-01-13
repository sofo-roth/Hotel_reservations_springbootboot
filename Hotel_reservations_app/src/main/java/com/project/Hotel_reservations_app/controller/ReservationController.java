package com.project.Hotel_reservations_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.project.Hotel_reservations_app.entity.User;
import com.project.Hotel_reservations_app.entity.Customer;
import com.project.Hotel_reservations_app.service.MyReservationService;
import com.project.Hotel_reservations_app.service.ReservationService;

@Controller
public class ReservationController {
	
	@Autowired
	private ReservationService service;
	
	@Autowired
	private MyReservationService myReservationService;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/customer_register")
	public String customerRegister() {
		return "customer_register";
	}
	
	@GetMapping("/room_register")
	public String roomRegister() {
		return "room_register";
	}
	
	@GetMapping("/customer_list")
	public ModelAndView getAllCustomers() {
		List<Customer>list=service.getAllReservations();

		return new ModelAndView("customer_list","User",list);
	}
	
	@GetMapping("/room_list")
	public String getAllRooms() {
		return "room_list";
	}
	
	
	@PostMapping("/save")
	public String addReservation(@ModelAttribute Customer r) {
		service.save(r);
		return "redirect:/customer_list";
	}
	
	@GetMapping("/reservation/my_reservation")
	public String getMyReservation(Model model) {
		
		List<User>list=myReservationService.getMyReservation();
		model.addAttribute("reservation",list);
		return "my_reservation";
	}
	
	@RequestMapping("/mylist/{id}")
	public String getMyList(@PathVariable("id") int id) {
		Customer r=service.getReservationById(id);
		User mr = new User(r.getId(),r.getName(),r.getSurname(),r.getPhone_number(),r.getAddress(),r.getCity(),r.getCountry(),r.getLanguage());
		myReservationService.saveMyReservation(mr);
		return "redirect:/my_reservation";
	}
	
	@RequestMapping("/editRoom/{id}")
	public String editRoom(@PathVariable("id") int id,Model model) {
		Customer r=service.getReservationById(id);
		model.addAttribute("reservation",r);
		return "customer_edit";
	}
	
	@RequestMapping("/deleteRoom/{id}")
	public String deleteRoom(@PathVariable("id")int id) {
		service.deleteById(id);
		return "redirect:/customer_list";
	}
}
