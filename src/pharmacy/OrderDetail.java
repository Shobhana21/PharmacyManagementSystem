package pharmacy;

public class OrderDetail {
	 private String orderDetailId;
	    private String orderId;
	    private String medicineId;
	    private int quantity;
	    private double price;

	    // Constructor
	    public OrderDetail(String orderDetailId, String orderId, String medicineId, int quantity, double price) {
	        this.orderDetailId = orderDetailId;
	        this.orderId = orderId;
	        this.medicineId = medicineId;
	        this.quantity = quantity;
	        this.price = price;
	    }
}
