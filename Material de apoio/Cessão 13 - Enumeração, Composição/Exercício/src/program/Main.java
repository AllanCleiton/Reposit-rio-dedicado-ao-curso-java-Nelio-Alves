package program;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.Color;
import entities.enums.OrderStatus;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Order order;
        System.out.println(Color.ANSI_BLACK + "Enter cliente data:" + Color.ANSI_RESET);
        
        if(true){
            System.out.print("Name: ");
            String name = sc.nextLine();
            
            System.out.print("Email: ");
            String email = sc.next();
            
            System.out.print("Birth date (DD/MM/YYYY): ");
            String birthDate = sc.next();

            System.out.println(Color.ANSI_BLACK + "Enter order data: " + Color.ANSI_RESET);
            System.out.print("Status: ");
            String status = sc.next();

            Client client = new Client(name, email, birthDate);
            order = new Order(LocalDateTime.now(), OrderStatus.valueOf(status), client);
        } 
        

        System.out.print("How many items to this order? ");
        int qdte = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<qdte;i++){
            System.out.printf(Color.ANSI_BLACK + "Enter #%d item data: \n",(i+1)); System.out.println(Color.ANSI_RESET);

            System.out.print("Product name: ");
            String name = sc.next(); 

            System.out.print("Product price: ");
            double price = sc.nextDouble();

            Product product = new Product(name, price);

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(quantity, product);

            order.addItem(orderItem);
            
        }
        System.out.println();
        System.out.println(order);

        sc.close();
    }
}
