package model.entities;

public class ItemSale {
    private final String name;
    private final Double price;
    private final Integer quantity;

    public ItemSale(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName(){
        return this.name;
    }
    public Double ValueTotal(){
        return this.price * this.quantity;
    }
}
