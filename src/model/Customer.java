package model;

public class Customer extends User {
    private String address;
    private String phoneNumber;

    public Customer(String userId, String name, String email, String password, String address, String phoneNumber) {
        super(userId, name, email, password);
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return super.toString() + ", Address: " + address + ", Phone: " + phoneNumber;
    }
}
