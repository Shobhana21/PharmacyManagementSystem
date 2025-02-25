package main;

import controller.PharmacyController;
import model.Admin;
import model.Customer;
import model.Medicine;
import view.PharmacyView;

import java.util.ArrayList;

public class PharmacyManagementSystem {
    public static void main(String[] args) {
        PharmacyController controller = new PharmacyController();
        PharmacyView view = new PharmacyView();

        // Creating sample admin and customer accounts
        ArrayList<Admin> admins = new ArrayList<>();
        ArrayList<Customer> customers = new ArrayList<>();

        admins.add(new Admin("A101", "Shobhana", "admin@example.com", "admin123"));
        customers.add(new Customer("C101", "John Doe", "john@example.com", "pass123", "123 Street", "9876543210"));

        // Ask user if they are Admin or Customer
        String userType = view.getUserInput("Are you an Admin or Customer? (A/C): ").toUpperCase();

        String email = view.getUserInput("Enter Email: ");
        String password = view.getUserInput("Enter Password: ");

        if (userType.equals("A")) {
            Admin loggedInAdmin = null;
            for (Admin admin : admins) {
                if (admin.getEmail().equals(email) && admin.checkPassword(password)) {
                    loggedInAdmin = admin;
                    break;
                }
            }

            if (loggedInAdmin != null) {
                view.displayMessage("Welcome, Admin " + loggedInAdmin.getName());
                handleAdminMenu(controller, view, loggedInAdmin);
            } else {
                view.displayMessage("Invalid Admin credentials!");
            }

        } else if (userType.equals("C")) {
            Customer loggedInCustomer = null;
            for (Customer customer : customers) {
                if (customer.getEmail().equals(email) && customer.checkPassword(password)) {
                    loggedInCustomer = customer;
                    break;
                }
            }

            if (loggedInCustomer != null) {
                view.displayMessage("Welcome, " + loggedInCustomer.getName());
                handleCustomerMenu(controller, view, loggedInCustomer);
            } else {
                view.displayMessage("Invalid Customer credentials!");
            }
        } else {
            view.displayMessage("Invalid input! Please restart the program.");
        }
    }

    private static void handleAdminMenu(PharmacyController controller, PharmacyView view, Admin admin) {
        while (true) {
            int choice = view.showAdminMenu();
            switch (choice) {
                case 1:
                    String id = view.getUserInput("Enter Medicine ID: ");
                    String name = view.getUserInput("Enter Medicine Name: ");
                    double price = Double.parseDouble(view.getUserInput("Enter Price: "));
                    Medicine medicine = new Medicine(id, name, price);
                    controller.addMedicine( medicine);
                    break;
                case 2:
                    String removeId = view.getUserInput("Enter Medicine ID to remove: ");
                    controller.removeMedicine(removeId);
                    break;
                case 3:
                    return;
                default:
                    view.displayMessage("Invalid choice!");
            }
        }
    }

    private static void handleCustomerMenu(PharmacyController controller, PharmacyView view, Customer customer) {
        while (true) {
            int choice = view.showCustomerMenu();
            switch (choice) {
                case 1:
                    String searchName = view.getUserInput("Enter Medicine Name: ");
                    Medicine found = controller.searchMedicine(searchName);
                    view.displayMessage(found != null ? found.toString() : "Medicine not found.");
                    break;
                case 2:
                    return;
                default:
                    view.displayMessage("Invalid choice!");
            }
        }
    }
}
