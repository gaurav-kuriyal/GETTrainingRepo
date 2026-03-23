package com.coforge.entities;

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
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long cid;
	private String cname;
	private String address;
	private String mobile;
	private String email;
	public Customer(String cname, String address, String mobile) {
		super();
		this.cname = cname;
		this.address = address;
		this.mobile = mobile;
	}
	public Customer(String cname, String address, String mobile, String email) {
		super();
		this.cname = cname;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
	}
	
	
}
