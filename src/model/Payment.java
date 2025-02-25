package model;

public class Payment {
    private String paymentId;
    private Order order;
    private double amount;
    private String paymentStatus;

    public Payment(String paymentId, Order order, double amount) {
        this.paymentId = paymentId;
        this.order = order;
        this.amount = amount;
        this.paymentStatus = "Pending";
    }

    public void processPayment() {
        this.paymentStatus = "Completed";
        System.out.println("Payment Successful! Amount Paid: $" + amount);
    }
}
