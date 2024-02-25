package entities;

public class OrderItem {
    private Integer quantity;
    private Double price;
    
    Product product;

    public OrderItem(){}

    public OrderItem(Integer quantity, Product product){
        this.quantity = quantity;
        this.product = product;
    }

    public Product getProduct(){
        return this.product;
    }

    public Integer getQuantity(){
       return this.quantity;
    }

    public Double getPrice(){
        return this.price;
    }


    public Double subTotal(){
        return quantity * product.getPrice();
    }
}
