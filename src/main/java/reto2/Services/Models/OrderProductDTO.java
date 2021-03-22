package reto2.Services.Models;

public class OrderProductDTO {
    private int orderProductId;
    public int getOrderProductId(){return orderProductId;}
    public void setOrderProductId(int orderProductId) {this.orderProductId=orderProductId;}

    private int productId;
    public int getProductId(){return productId;}
    public void setProductId(int productId) {this.productId=productId;}

    private int orderId;
    public int getOrderId(){return orderId;}
    public void setOrderId(int orderId) {this.orderId=orderId;}

    private int quantity;
    public int getQuantity(){return quantity;}
    public void setQuantity(int quantity) {this.quantity=quantity;}

}
