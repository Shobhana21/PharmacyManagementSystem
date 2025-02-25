package model;
import java.util.ArrayList;

public class Customer extends User {
	
	    private String address;
	    private String phoneNumber;
    private ArrayList<Order> orders; // Stores customer orders

    public Customer(String userId, String name, String email, String password, String address, String phoneNumber) {
        super(userId, name, email, password);  // Call the parent `User` constructor
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }
}
