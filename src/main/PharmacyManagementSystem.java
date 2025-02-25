package main;

import model.Admin;
import model.Customer;
import model.Medicine;
import model.Order;
import model.OrderDetail;

public class PharmacyManagementSystem {
    public static void main(String[] args) {
        // Step 1: Create an Admin and manage medicines
        Admin admin = new Admin("A101", "Shobhana", "admin@example.com", "admin123");

        // Adding medicines
        Medicine med1 = new Medicine("M001", "Paracetamol", 1.5);
        Medicine med2 = new Medicine("M002", "Cough Syrup", 3.0);
        Medicine med3 = new Medicine("M003", "Vitamin C", 2.5);

        admin.addMedicine(med1);
        admin.addMedicine(med2);
        admin.addMedicine(med3);

        // Display available medicines
        System.out.println("\n=== Available Medicines ===");
        admin.listMedicines();

        // Step 2: Create a Customer
        Customer customer = new Customer("C101", "John Doe", "john@example.com", "pass123", "123 Street", "9876543210");

        // Step 3: Customer places an order
        Order order = new Order("O101", customer.getUserId());

        // Step 4: Add medicines to the order
        order.addOrderDetail(new OrderDetail(med1.getMedicineId(), 2, med1.getPrice()));
        order.addOrderDetail(new OrderDetail(med2.getMedicineId(), 1, med2.getPrice()));

        // Step 5: Display order details
        System.out.println("\n=== Order Summary ===");
        System.out.println(order);
    }
}
