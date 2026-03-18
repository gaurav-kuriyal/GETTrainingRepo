package com.coforge.entities;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long aid;
	@NotBlank
	private String city;
	@NotBlank
	private String state;
	@Pattern(regexp="[1-9][0-9]{5}")
	private String pincode;
	
	public Address(@NotBlank String city, @NotBlank String state, @Pattern(regexp = "[1-9][0-9]{5}") String pincode) {
		super();
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	
	
}
