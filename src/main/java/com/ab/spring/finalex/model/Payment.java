package com.ab.spring.finalex.model;

public class Payment {
	private String id;
    private String amount;
    private String date;
    
    public Payment() {
    	
    }
    
	public Payment(String id, String amount, String date) {
		super();
		this.id = id;
		this.amount = amount;
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}	
    
}
