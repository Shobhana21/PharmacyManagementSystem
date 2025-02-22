package pharmacy;

public class Admin extends User{
	private String role; // e.g., "Manager", "Supervisor"

    // Constructor
    public Admin(String userId, String name, String email, String password, String role) {
        super(userId, name, email, password);
        this.role = role;
    }
}
