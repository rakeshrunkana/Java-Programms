package com.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.Booking;
import com.service.LoginService;

@Controller
public class KLMController {
	
	@Autowired
	LoginService loginService;
	
	
	@RequestMapping("/home")
	public String getLogin() {
		return "login";
	}
	
//	@RequestMapping("/validate-login")
	@PostMapping("/validate-login")
	public String validateLogin(@RequestParam("username") String username,@RequestParam("password") String password) {
		System.out.println("User name is "+username);
		System.out.println("Password is "+password);
		String response = loginService.authenticateUser(username, password);
		return response;
	}
	
	@GetMapping("/bookJourney")
    public String createBooking(Model model) {
		
		return "booking";
	}

	
	
	
	
	@GetMapping("/viewBookings")
    public String getBookings(Model model) {
        // Create sample bookings
        List<Booking> bookings = new ArrayList<>();
        bookings.add(new Booking("City A", "City B", LocalDate.of(2024, 3, 10), 2));
        bookings.add(new Booking("City C", "City D", LocalDate.of(2024, 3, 12), 1));
        bookings.add(new Booking("City E", "City F", LocalDate.of(2024, 3, 15), 4));

        // Add bookings data to the model
        model.addAttribute("bookings", bookings);

        // Return the name of the JSP file to render
        return "bookinglistdata";
    }


}
