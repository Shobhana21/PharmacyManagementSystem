package controller;

import model.*;

import java.util.HashMap;
import java.util.Map;

public class PharmacyController {

    private Map<String, Medicine> medicines;
    private Map<String, Order> orders;

    public PharmacyController() {
        medicines = new HashMap<>();
        orders = new HashMap<>();
    }

    // Admin methods for adding/removing/listing medicines
    public void addMedicine(Medicine medicine) {
        medicines.put(medicine.getMedicineId(), medicine);
    }

    public void removeMedicine(String medicineId) {
        medicines.remove(medicineId);
    }

    public void listMedicines() {
        if (medicines.isEmpty()) {
            System.out.println("No medicines available.");
        } else {
            System.out.println("Available Medicines:");
            for (Medicine medicine : medicines.values()) {
                System.out.println(medicine);
            }
        }
    }

    // Customer methods
    public Medicine searchMedicine(String name) {
        for (Medicine medicine : medicines.values()) {
            if (medicine.getName().equalsIgnoreCase(name)) {
                return medicine;
            }
        }
        return null; // Return null if no match is found
    }

    // Creating an order for a customer
    public Order createOrder(Customer customer, String medicineId, int quantity) {
        Medicine medicine = medicines.get(medicineId);
        if (medicine != null) {
            Order order = new Order(customer.getUserId(), medicine, quantity);
            customer.addOrder(order);
            orders.put(order.getOrderId(), order);
            return order;
        }
        return null;  // Medicine not found, returning null
    }

    // Processing payment
    public boolean processPayment(Customer customer, Order order, String method) {
        double totalAmount = order.getTotalPrice();
        if (method.equalsIgnoreCase("Card") || method.equalsIgnoreCase("UPI") || method.equalsIgnoreCase("Cash")) {
            // You can add more complex payment logic here (like payment gateway)
            System.out.println("Payment of $" + totalAmount + " made successfully via " + method);
            order.setPaid(true);  // Mark order as paid
            return true;
        }
        return false; // Invalid payment method
    }
}
