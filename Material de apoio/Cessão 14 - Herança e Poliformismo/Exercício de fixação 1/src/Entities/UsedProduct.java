package Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class UsedProduct extends Product{
    private LocalDate manofactureDate;

    public UsedProduct (){}

    public UsedProduct(String name, Double price, String manofactureDate) {
        super(name, price);
        
        this.manofactureDate = LocalDate.parse(manofactureDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String getManufactureDate() {
        return manofactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    @Override
    public String priceTag(){
        return getName() + " (used) $ " + String.format("%.2f", getPrice()) + " (Manufactured date: " + getManufactureDate();
    }
}
