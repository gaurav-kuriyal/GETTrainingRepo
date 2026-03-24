package com.coforge.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long bookingId;
	private String customerName;
	private String customerMobileNum;
	private int seatCount;
	private LocalDate bookingDate;
	private String showTime;
	private double totalAmount;
	
	@ManyToOne
	@JoinColumn(name="movieId")
	private Movie movie;

	public Booking(String customerName, String customerMobileNum, int seatCount, LocalDate bookingDate, String showTime,
			double totalAmount) {
		super();
		System.out.println("arrived");
		this.customerName = customerName;
		this.customerMobileNum = customerMobileNum;
		this.seatCount = seatCount;
		this.bookingDate = bookingDate;
		this.showTime = showTime;
		this.totalAmount = totalAmount;
	}
	
}
