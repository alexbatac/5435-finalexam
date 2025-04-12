package com.ab.spring.finalex.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reservations")
public class Reservation {
    @Id
    private String id;
    private String details;
    private String ticketNumber;
    private String date;
    private Customer customer;
    private Payment payment;
	
    public Reservation() {
    }
    
    public Reservation(String id, String details, String ticketNumber, String date, Customer customer,
			Payment payment) {
		super();
		this.id = id;
		this.details = details;
		this.ticketNumber = ticketNumber;
		this.date = date;
		this.customer = customer;
		this.payment = payment;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

    
    
}