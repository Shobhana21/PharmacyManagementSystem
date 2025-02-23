package model;

public class Medicine {
	    private String medicineId;
	    private String name;
	    private double price;
	    private int quantity;
	    
	    public Medicine(String medicineId, String name, double price, int quantity) {
	        this.medicineId = medicineId;
	        this.name = name;
	        this.price = price;
	        this.quantity = quantity;
	    }
	    
	    public String getMedicineId() { return medicineId; }
	    public String getName() { return name; }
	    public double getPrice() { return price; }
	    public int getQuantity() { return quantity; }
	    
	    public void setQuantity(int quantity) { this.quantity = quantity; }

	    public String toString() {
	        return "Medicine ID: " + medicineId + ", Name: " + name + ", Price: $" + price + ", Quantity: " + quantity;
	    }
}
