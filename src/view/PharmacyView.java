package view;
import java.util.Scanner;

public class PharmacyView {
    private Scanner scanner;

    public PharmacyView() {
        scanner = new Scanner(System.in);
    }



    public String getUserInput(String message) {
        System.out.print(message);
        return scanner.next();
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
    
    public int showAdminMenu() {
        System.out.println("\nAdmin Menu");
        System.out.println("1. Add Medicine");
        System.out.println("2. Remove Medicine");
        System.out.println("3. Logout");
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    public int showCustomerMenu() {
        System.out.println("\nCustomer Menu");
        System.out.println("1. Search Medicine");
        System.out.println("2. Logout");
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

}
