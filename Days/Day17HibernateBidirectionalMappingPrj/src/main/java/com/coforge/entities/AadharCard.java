package com.coforge.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class AadharCard {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String aadharid;
	private String address;
	
	@OneToOne(mappedBy="aadhar")
	private Citizen citizen;

	public AadharCard(String address) {
		super();
		this.address = address;
	}
	
	
	
}
