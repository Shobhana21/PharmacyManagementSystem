package model;

public class Medicine {
    private String medicineId;
    private String name;
    private double price;

    public Medicine(String medicineId, String name, double price) {
        this.medicineId = medicineId;
        this.name = name;
        this.price = price;
    }

    public String getMedicineId() {
        return medicineId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Medicine ID: " + medicineId + ", Name: " + name + ", Price: $" + price;
    }
}
