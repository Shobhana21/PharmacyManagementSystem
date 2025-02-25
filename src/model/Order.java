public class Order {
    private String orderId;
    private String customerId;
    private Medicine medicine;
    private int quantity;
    private boolean isPaid;

    public Order(String customerId, Medicine medicine, int quantity) {
        this.orderId = generateOrderId();
        this.customerId = customerId;
        this.medicine = medicine;
        this.quantity = quantity;
        this.isPaid = false;  // Initially, the order is not paid
    }

    // Generate a unique order ID (you can implement this differently)
    private String generateOrderId() {
        return "ORD" + System.currentTimeMillis();
    }

    public String getOrderId() {
        return orderId;
    }

    public double getTotalPrice() {
        return medicine.getPrice() * quantity;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public boolean isPaid() {
        return isPaid;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId + ", Medicine: " + medicine.getName() + ", Quantity: " + quantity + ", Paid: " + (isPaid ? "Yes" : "No");
    }
}
