package com.coforge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.entities.Booking;
import com.coforge.services.BookingService;

@RestController
@RequestMapping("/bookings")
public class BookingController {
	@Autowired
	BookingService bookingService;
	
	@GetMapping("/")
	public List<Booking> getAllBookings(){
		return bookingService.getAllBookings();
	}
	
	@PostMapping("/")
	public Booking addBooking(@RequestBody Booking booking){
		System.out.println(booking);
		return bookingService.addBooking(booking);
	}
	
	@GetMapping("/{bookingId}")
	public Booking getBookingById(@PathVariable("bookingId") long bookingId){
		return bookingService.getBookingById(bookingId);
	}
	
	@GetMapping("/customername/{cname}")
	public List<Booking> getAllBookingsByCustomerName(@PathVariable("cname") String cname){
		return bookingService.getAllBookingsByCustomerName(cname);
	};
	
}
