package model;

public class Medicine {

	    private String medicineId;
	    private String name;
	    private String manufacturer;
	    private double price;
	    private int stockQuantity;

	    // Constructor
	    public Medicine(String medicineId, String name, String manufacturer, double price, int stockQuantity) {
	        this.medicineId = medicineId;
	        this.name = name;
	        this.manufacturer = manufacturer;
	        this.price = price;
	        this.stockQuantity = stockQuantity;
	    }

}
