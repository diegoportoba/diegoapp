package reto2.Services.Models;

public class OrderDTO {
    
    private int orderId;
    public int getOrderId(){return orderId;}
    public void setOrderId(int orderId) {this.orderId=orderId;}

    private String creationDate;
    public String getCreationDate(){return creationDate;}
    public void setCreationDate(String creationDate) {this.creationDate=creationDate;}
    
    private String userName;
    public String getUserName(){ return userName;}
    public void setUserName(String userName) {this.userName=userName;}

    private String orderState;
    public String getOrderState(){ return orderState;}
    public void setOrderState(String orderState) {this.orderState=orderState;}
}
