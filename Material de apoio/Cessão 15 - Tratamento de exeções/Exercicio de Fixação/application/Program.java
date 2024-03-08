package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the account data:");
        System.out.print("Number: "); 
            int number = sc.nextInt();
        System.out.print("Holder: "); 
            sc.nextLine(); 
            String holder = sc.nextLine();
        System.out.print("Initial balance: "); 
            double balance = sc.nextDouble();
        System.out.print("WithDrawn Limit: "); 
            double withDrawnLimit = sc.nextDouble();

        Account account = new Account(number, holder, balance, withDrawnLimit);
        
        System.out.println();

       
        
        boolean erro = false;
        do{
            try {

                System.out.print("Enter amount for WithDrawn: ");
                double amount = sc.nextDouble();
                account.withDrawn(amount);
                erro = false;
            } catch (DomainException e) {
                System.out.println(e.getMessage());
                erro = true;
            }
        }while(erro == true);

        System.out.println(account);
        


        sc.close();
    }   
}
