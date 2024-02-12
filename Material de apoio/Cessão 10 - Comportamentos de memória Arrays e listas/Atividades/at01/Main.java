package at02;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Product[] products = new Product[n];

        for(int i=0; i < products.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            products[i] = new Product(name, price);
        }

        double m=0;
        for(int i = 0; i < products.length; i++){
            m += products[i].getPrice();
        }

        m = m/n;
        
        System.out.printf("Average price = $ %.2f", m);


        sc.close();

    }
}
