package model;

public class Admin extends User {
    public Admin(String userId, String name, String email, String password) {
        super(userId, name, email, password);
    }

    public void manageMedicines() {
        System.out.println("Admin " + getName() + " is managing medicines.");
    }
}
