package Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProduct;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int choice = sc.nextInt();
        for(int i = 0; i < choice; i++){
            String name;
            double price;
            System.out.printf("Product #%d data:\n",(i+1));            
            boolean next = false;
            do {
                System.out.print("Common, used or imported (c/u/i)? ");
                
                char c = sc.next().charAt(0);
                if(c == 'c' || c == 'u' || c == 'i')
                    next = true;
                switch (c) {
                    case 'c':
                        sc.nextLine();
                        System.out.print("Name: ");
                        name = sc.nextLine();
                        System.out.print("Price: ");
                        price = sc.nextDouble();
                        
                        products.add(new Product(name, price));
                        sc.nextLine();
                        break;
                    case 'u':
                        sc.nextLine();
                        System.out.print("Name: ");
                        name = sc.nextLine();
                        System.out.print("Price: ");
                        price = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Manufacture date: (DD/MM/YYYY): ");
                        
                        String date = sc.next();
                        
                        products.add(new UsedProduct(name, price, date));
                        break;
                    case 'i':
                        sc.nextLine();
                        System.out.print("Name: ");
                        name = sc.nextLine();
                        System.out.print("Price: ");
                        price = sc.nextDouble();
                        System.out.print("Customs fee: ");
                        double customsFee = sc.nextDouble();
    
                        products.add(new ImportedProduct(name, price, customsFee));
                        break;
                    default:
                        System.out.print("invalid option, try again");
                        break;
                }
            } while (next == false);
        }

        System.out.println("PRICE TAGS:");
        for (Product product : products) {
            System.out.println(product.priceTag());
        }


        sc.close();
    }
}
