package com.ab.spring.finalex.model;

public class Customer {
    private String address;
    private String reservation;
    private String details;
    
    public Customer() {
    }
	
    public Customer(String address, String reservation, String details) {
		super();
		this.address = address;
		this.reservation = reservation;
		this.details = details;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getReservation() {
		return reservation;
	}

	public void setReservation(String reservation) {
		this.reservation = reservation;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

    
}
