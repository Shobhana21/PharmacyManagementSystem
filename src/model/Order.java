
	package model;
	import java.util.ArrayList;
	import java.util.Date;

	public class Order {
	    private String orderId;
	    private String customerId;
	    private Date orderDate;
	    private double totalAmount;
	    private ArrayList<OrderDetail> orderDetails;

	    public Order(String orderId, String customerId) {
	        this.orderId = orderId;
	        this.customerId = customerId;
	        this.orderDate = new Date();
	        this.orderDetails = new ArrayList<>();
	        this.totalAmount = 0.0;
	    }

	    public void addOrderDetail(OrderDetail detail) {
	        orderDetails.add(detail);
	        totalAmount += detail.getTotalPrice();
	    }

	    public String getOrderId() {
	        return orderId;
	    }

	    public String getCustomerId() {
	        return customerId;
	    }

	    public Date getOrderDate() {
	        return orderDate;
	    }

	    public double getTotalAmount() {
	        return totalAmount;
	    }

	    public ArrayList<OrderDetail> getOrderDetails() {
	        return orderDetails;
	    }

	    @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        sb.append("Order ID: ").append(orderId)
	          .append("\nCustomer ID: ").append(customerId)
	          .append("\nOrder Date: ").append(orderDate)
	          .append("\nTotal Amount: ").append(totalAmount)
	          .append("\nOrder Details:\n");

	        for (OrderDetail detail : orderDetails) {
	            sb.append(detail.toString()).append("\n");
	        }
	        return sb.toString();
	    }
	}

	   
