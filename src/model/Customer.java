package model;

import pharmacy.User;

public class Customer extends User {
	 private String address;
	    private String phoneNumber;

	    // Constructor
	    public Customer(String userId, String name, String email, String password, String address, String phoneNumber) {
	        super(userId, name, email, password);
	        this.address = address;
	        this.phoneNumber = phoneNumber;
	    }
}
