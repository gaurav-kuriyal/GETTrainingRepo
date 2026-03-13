package com.coforge.beans;

public class Customer {
	private String cname;
	private long cid;
	private String mobile;
	private String email;
	private Address address;
	public Customer() {
		super();
	}
	public Customer(String cname, long cid, String mobile, String email, Address address) {
		super();
		this.cname = cname;
		this.cid = cid;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getCid() {
		return cid;
	}
	public void setCid(long cid) {
		this.cid = cid;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [cname=" + cname + ", cid=" + cid + ", mobile=" + mobile + ", email=" + email + ", address="
				+ address + "]";
	}
	
	
}
