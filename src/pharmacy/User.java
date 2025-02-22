package pharmacy;

public class User {
	 protected String userId;
	    protected String name;
	    protected String email;
	    protected String password;

	    // Constructor
	    public User(String userId, String name, String email, String password) {
	        this.userId = userId;
	        this.name = name;
	        this.email = email;
	        this.password = password;
	    }
}
