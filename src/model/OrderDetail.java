package model;

public class OrderDetail {
	
	    private String medicineId;
	    private int quantity;
	    private double pricePerUnit;
	    private double totalPrice;

	    public OrderDetail(String medicineId, int quantity, double pricePerUnit) {
	        this.medicineId = medicineId;
	        this.quantity = quantity;
	        this.pricePerUnit = pricePerUnit;
	        this.totalPrice = quantity * pricePerUnit;
	    }

	    public String getMedicineId() {
	        return medicineId;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public double getPricePerUnit() {
	        return pricePerUnit;
	    }

	    public double getTotalPrice() {
	        return totalPrice;
	    }

	    @Override
	    public String toString() {
	        return "Medicine ID: " + medicineId + ", Quantity: " + quantity +
	               ", Price per Unit: " + pricePerUnit + ", Total Price: " + totalPrice;
	    }
	
}
