package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
     private static DateTimeFormatter fmr = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");

    private LocalDateTime moment;
    private OrderStatus status;

    List<OrderItem> items = new ArrayList<>();

    Client client;

    public Order(){}

    public Order(LocalDateTime moment, OrderStatus status, Client client){
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment(){
        return moment;
    }

    public OrderStatus getOrderStatus(){
        return status;
    }

    public List<OrderItem> getOrderItem(){
        return items;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }
    
    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public Client getClient(){
        return this.client;
    }

    public double totalPrice(){
        double total=0.0;
        for (OrderItem orderItem : items) {
            total += orderItem.subTotal();
        }
        return total;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("ORDER SUMARY: \n");
        stringBuilder.append("Order moment: " + fmr.format(moment)+"\n");
        stringBuilder.append("Order status: " + getOrderStatus()+"\n");
        stringBuilder.append(
            "Client: " 
            + getClient().getName() 
            + " " 
            + getClient().getBirthDate() 
            + " - " 
            + getClient().getEmail()
            +"\n");
        stringBuilder.append("Order items:\n");
        for (OrderItem orderItem : items) {
            stringBuilder.append(orderItem.getProduct().getName() + ", ");
            stringBuilder.append("$"+String.format("%.2f", orderItem.getProduct().getPrice()) + ", ");
            stringBuilder.append("Quantity: " + orderItem.getQuantity()+", ");
            stringBuilder.append("Subtotal: $" +String.format("%.2f", orderItem.subTotal()) +"\n");
        }
        stringBuilder.append("Total: $" + String.format("%.2f",totalPrice()));
        return stringBuilder.toString();
    }
}
