class Order {
    private String orderId;
    private String orderDate;
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    public String getOrderId() {
        return orderId;
    }
    public String getOrderDate() {
        return orderDate;
    }
    public String getOrderStatus() {
        return "Order Placed";
    }
}
class ShippedOrder extends Order {
    private String trackingNumber;
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    public String getTrackingNumber() {
        return trackingNumber;
    }
    public String getOrderStatus() {
        return "Order Shipped";
    }
}
class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    public String getDeliveryDate() {
        return deliveryDate;
    }
    public String getOrderStatus() {
        return "Order Delivered";
    }
}
public class c {
    public static void main(String[] args) {
        DeliveredOrder order = new DeliveredOrder("ORD123", "2025-04-10", "TRK456", "2025-04-15");
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Order Date: " + order.getOrderDate());
        System.out.println("Tracking Number: " + order.getTrackingNumber());
        System.out.println("Delivery Date: " + order.getDeliveryDate());
        System.out.println("Status: " + order.getOrderStatus());
    }
}