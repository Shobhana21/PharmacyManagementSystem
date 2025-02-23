package main;

import model.Admin;
import model.Customer;
import model.Medicine;

public class PharmacyManagementSystem {
    public static void main(String[] args) {
        Admin admin = new Admin("A101", "Shobhana", "admin@example.com", "admin123");
        Customer customer = new Customer("C101", "John Doe", "john@example.com", "pass123", "123 Street", "9876543210");

        System.out.println(admin);
        System.out.println(customer);

        // Admin manages medicines
        Medicine med1 = new Medicine("M001", "Paracetamol", 10.5, 50);
        Medicine med2 = new Medicine("M002", "Ibuprofen", 15.0, 30);

        admin.addMedicine(med1);
        admin.addMedicine(med2);
        admin.listMedicines();

        admin.removeMedicine("M001");
        admin.listMedicines();
    }
}
