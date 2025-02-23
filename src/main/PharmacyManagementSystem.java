package main;

import model.Admin;
import model.Customer;

public class PharmacyManagementSystem {
	 public static void main(String[] args) {
	        Admin admin = new Admin("A101", "Shobhana", "admin@example.com", "admin123");
	        Customer customer = new Customer("C101", "John Doe", "john@example.com", "pass123", "123 Street", "9876543210");

	        System.out.println(admin);
	        System.out.println(customer);
	    }
}
