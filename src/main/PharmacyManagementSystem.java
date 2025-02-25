package main;

import java.util.Scanner;
import controller.PharmacyController;

public class PharmacyManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PharmacyController pharmacyController = new PharmacyController();

        while (true) {
            System.out.println("\n===== Pharmacy Management System =====");
            System.out.println("1. Admin Login");
            System.out.println("2. Customer Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            
            switch (choice) {
                case 1:
                    pharmacyController.runAdminDashboard(scanner);
                    break;
                case 2:
                    pharmacyController.runCustomerDashboard(scanner);
                    break;
                case 3:
                    System.out.println("Exiting... Thank you!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
