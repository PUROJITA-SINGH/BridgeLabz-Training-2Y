public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        Order order = new Order("O001", "2025-09-21");
        ShippedOrder shipped = new ShippedOrder("O002", "2025-09-21", "TRK123");
        DeliveredOrder delivered = new DeliveredOrder("O003", "2025-09-21", "TRK456", "2025-09-22");
        
        System.out.println(order.getOrderStatus());
        System.out.println(shipped.getOrderStatus());
        System.out.println(delivered.getOrderStatus());
    }
}

class Order {
    protected String orderId;
    protected String orderDate;
    
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    
    public String getOrderStatus() {
        return "Order ID: " + orderId + ", Status: Placed on " + orderDate;
    }
}

class ShippedOrder extends Order {
    protected String trackingNumber;
    
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    
    @Override
    public String getOrderStatus() {
        return super.getOrderStatus() + ", Shipped with Tracking: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;
    
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    
    @Override
    public String getOrderStatus() {
        return super.getOrderStatus() + ", Delivered on " + deliveryDate;
    }
}
