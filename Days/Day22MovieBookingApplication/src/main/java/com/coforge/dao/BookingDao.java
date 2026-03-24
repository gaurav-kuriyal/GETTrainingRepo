package com.coforge.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.coforge.entities.Booking;
import com.coforge.repositories.BookingRepository;

@Repository
public class BookingDao {
	@Autowired
	BookingRepository bookingRepository;
	
	public List<Booking> getAllBookings(){
		return bookingRepository.findAll();
	}

	public Booking addBooking(Booking booking){
		return bookingRepository.save(booking);
	}

	public Optional<Booking> getBookingById(long id){
		return bookingRepository.findById(id);
	}
	
	public List<Booking> getAllBookingsByCustomerName(String cname){
		return bookingRepository.getAllBookingsByCustomerName(cname);
	};
}
