package model;
import java.util.List;

public class Order {
	
	    private String orderId;
	    private String customerId;
	    private List<OrderDetail> orderDetails;
	    private double totalAmount;
	    private String orderDate;

	    // Constructor
	    public Order(String orderId, String customerId, List<OrderDetail> orderDetails, double totalAmount, String orderDate) {
	        this.orderId = orderId;
	        this.customerId = customerId;
	        this.orderDetails = orderDetails;
	        this.totalAmount = totalAmount;
	        this.orderDate = orderDate;
	    }
}
