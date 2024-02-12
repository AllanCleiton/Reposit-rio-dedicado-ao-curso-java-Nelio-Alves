package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Entities.Account;
import Entities.Person;

public class Main{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter account Number: ");
        int accNumber = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();
        
        Person holder = new Person(name);
        
        Account account = new Account(accNumber, holder);

        
        

        System.out.print("Is there an initial deposite (y/n)? ");
        double value=0;
        if (sc.next().equals("y")){    
            do{ 
                System.out.print("\nEnter initial deposit value: ");
                value = sc.nextDouble();
                account.deposit(value);
            }while (!(value > 0));
        }

        System.out.println("Account data:");
        account.info();

        System.out.println("\n");
        
        do{ 
            System.out.print("\nEnter a deposit value: ");
            value = sc.nextDouble();
            account.deposit(value);
        }while (!(value > 0));
        
        System.out.println("Updated account data:");
        account.info();

        System.out.println("\n");

        if(account.getBalance() > 0){
            do{
                System.out.print("Enter a withdraw value: ");
                value = sc.nextDouble();
                account.withdraw(value);
            }while(!(value > 0));
        }else{
            System.out.println("You can not deposit, your account is negative.");
        }
        

        System.out.println("Updated account data:");
        account.info();


        sc.close();
    }
}