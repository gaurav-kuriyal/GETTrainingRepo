package com.coforge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.dao.BookingDao;
import com.coforge.entities.Booking;

@Service
public class BookingService {
	@Autowired
	BookingDao bookingDao;
	
	public List<Booking> getAllBookings(){
		return bookingDao.getAllBookings();
	}

	public Booking addBooking(Booking booking){
		return bookingDao.addBooking(booking);
	}

	public Booking getBookingById(long id){
		return bookingDao.getBookingById(id).get();
	}
	
	public List<Booking> getAllBookingsByCustomerName(String cname){
		return bookingDao.getAllBookingsByCustomerName(cname);
	}
	
	public List<Booking> getBookingByTotalAmount(double ta){
		return bookingDao.getBookingByTotalAmount(ta);
	}
}
