package reto2.Repositories.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "OrderProducts")
@Entity(name="OrderProducts")
public class OrderProductEntity {

    private @Id @GeneratedValue int orderProductId;
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

    public OrderProductEntity(int orderId, int productId, int quantity) {
        
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
    }

    public OrderProductEntity() {
        
    }
}
