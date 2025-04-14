
public class Order {
    String orderId,orderDate;
    Order(String orderId,String orderDate){
        this.orderId=orderId;
        this.orderDate=orderDate;
    }
    public void getOrderStatus() {
        System.out.println("\nOrder ID -> "+orderId);
        System.out.println("Order Date -> "+orderDate);
        System.out.println("Order placed");
    }  
    public static void main(String[] args) {
        Order o1=new Order("2394", "21-03-25");
        o1.getOrderStatus();
        ShippedOrder o2=new ShippedOrder("8e0298s", "24-05-25", 39487);
        o2.getOrderStatus();
        DeliveredOrder o3=new DeliveredOrder("dfjg9r3","09-04-25", 123456, "26-04-25");
        o3.getOrderStatus();
    }
}

class ShippedOrder extends Order{
    int trackingNo;
    ShippedOrder(String orderId,String orderDate,int trackingNo){
        super(orderId, orderDate);
        this.trackingNo=trackingNo;
    }  
    public void getOrderStatus() {
        System.out.println("\nOrder ID -> "+orderId);
        System.out.println("Order Date -> "+orderDate);
        System.out.println("Tracking No ->"+trackingNo);        
        System.out.println("Order shipped");
    }  
}

class DeliveredOrder extends ShippedOrder{
    String deliveryDate;
    DeliveredOrder(String orderId,String orderDate,int trackingNo,String deliveryDate){
        super(orderId, orderDate, trackingNo);
        this.deliveryDate=deliveryDate;
    }    
    public void getOrderStatus() {
        System.out.println("\nOrder ID -> "+orderId);
        System.out.println("Order Date -> "+orderDate);
        System.out.println("Tracking No ->"+trackingNo);  
        System.out.println("Delivery Date -> "+deliveryDate);
        System.out.println("Order delivered");
    }
}


