package com.coforge.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.coforge.entities.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long>{

	public List<Booking> findByShowTime(@Param("showTime") String showTime);

	@Query(value="SELECT * FROM booking WHERE customer_name=cname",nativeQuery =true)
	public List<Booking> getAllBookingsByCustomerName(@Param("cname") String cname);
	
	@Query("SELECT b FROM Booking b WHERE bookingDate=:bdate")
	public List<Booking> getAllBookingsByBookingDate(@Param("bdate") LocalDate bookingDate);
	
	@Query("SELECT b FROM Booking b WHERE customerName=:cname and customerMobileNum=:cmobile ")
	public Booking getAllBookingsByCustomerAndMobile(@Param("cname") String cname,@Param("cmobile") String cmobile);
	
}