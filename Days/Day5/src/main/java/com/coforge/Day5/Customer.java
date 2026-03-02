package com.coforge.Day5;

public class Customer implements Comparable<Customer>{
	private int custId;
	private String custName;
	private String city;
	private double orderCost;
	public Customer() {
		super();
	}
	public Customer(int custId, String custName, String city, double orderCost) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.city = city;
		this.orderCost = orderCost;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", city=" + city + ", orderCost=" + orderCost
				+ "]";
	}
	
//	@Override
//	public int compare(Customer o1, Customer o2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	
	

//	@Override
//	public int compareTo(Customer o) {
//		// TODO Auto-generated method stub
//		return (int)(this.getOrderCost()-o.getOrderCost());
//	}
	
//	@Override
//	public int compareTo(Customer o) {
//		// TODO Auto-generated method stub
//		return this.getCustName().compareTo(o.getCustName());
//	}
//	@Override
//	public int compareTo(Customer o) {
//		// TODO Auto-generated method stub
//		return this.getCity().compareTo(o.getCity());
//	}
	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return (int)(this.getCustId()-o.getCustId());
	}
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getOrderCost() {
		return orderCost;
	}
	public void setOrderCost(double orderCost) {
		this.orderCost = orderCost;
	}
	
	
}
