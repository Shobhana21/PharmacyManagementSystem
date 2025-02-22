package pharmacy;

public class Payment {

	private String paymentId;
    private String orderId;
    private double amountPaid;
    private String paymentDate;
    private String paymentMethod; // "Credit Card", "Cash", etc.

    // Constructor
    public Payment(String paymentId, String orderId, double amountPaid, String paymentDate, String paymentMethod) {
        this.paymentId = paymentId;
        this.orderId = orderId;
        this.amountPaid = amountPaid;
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
    }

}
