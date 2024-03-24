public class Product implements Comparable<Product>{
    private String name;
    private Double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + ", " + price;
    }

    @Override
    public int compareTo(Product o) {
        return price.compareTo(o.getPrice());
    }

    

    

    
}
