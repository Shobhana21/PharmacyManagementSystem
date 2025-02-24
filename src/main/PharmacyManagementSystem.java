package main;

import model.Admin;
import model.Customer;
import model.Medicine;
import java.util.Scanner;

public class PharmacyManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Creating Admin and Customer (You can later replace this with login logic)
        Admin admin = new Admin("A101", "Shobhana", "admin@example.com", "admin123");
        Customer customer = new Customer("C101", "John Doe", "john@example.com", "pass123", "123 Street", "9876543210");

        System.out.println("Welcome to the Pharmacy Management System!");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Medicine");
            System.out.println("2. Remove Medicine");
            System.out.println("3. List Medicines");
            System.out.println("4. Search Medicine");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1: // Add Medicine
                    System.out.print("Enter Medicine ID: ");
                    String medId = scanner.nextLine();
                    System.out.print("Enter Medicine Name: ");
                    String medName = scanner.nextLine();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    
                    Medicine medicine = new Medicine(medId, medName, price);
                    admin.addMedicine(medicine);
                    break;
                
                case 2: // Remove Medicine
                    System.out.print("Enter Medicine ID to remove: ");
                    String removeId = scanner.nextLine();
                    admin.removeMedicine(removeId);
                    break;
                
                case 3: // List Medicines
                    admin.listMedicines();
                    break;
                
                case 4: // Search Medicine
                    System.out.print("Enter Medicine Name to search: ");
                    String searchName = scanner.nextLine();
                    Medicine foundMed = admin.searchMedicine(searchName);
                    if (foundMed != null) {
                        System.out.println("Medicine Found: " + foundMed);
                    } else {
                        System.out.println("Medicine not found.");
                    }
                    break;
                
                case 5: // Exit
                    System.out.println("Exiting Pharmacy Management System. Goodbye!");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
