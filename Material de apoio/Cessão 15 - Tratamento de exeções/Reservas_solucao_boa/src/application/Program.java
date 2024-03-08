package application;

import java.util.Date;
import java.util.InputMismatchException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import model.entities.Reservation;
import model.exception.DomainExceptioin;

public class Program{
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Reservation reservation = null;
        boolean error = false;
        do{
            try{
            System.out.print("Room number: ");
            int number = sc.nextInt();
            
            System.out.print("check-in date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            
            System.out.print("check-out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        }
        catch(DomainExceptioin e){
            System.out.println("Error: " + e.getMessage());
            error = true;
        }
        catch(ParseException e){
            System.out.println("Error: " + e.getMessage());
            error = true;
        }
        catch(InputMismatchException e){
            System.out.println("Error: Value inserts is not number" );
            error = true;
            sc.nextLine();
        }
        }while(error == true); 

        
        do{
            error = false;
            try{
                System.out.println();

                System.out.println("Enter date to update the reservation: ");

                System.out.print("check-in date (dd/MM/yyyy): ");
                Date checkIn = sdf.parse(sc.next());
            
                System.out.print("check-out date (dd/MM/yyyy): ");
                Date checkOut = sdf.parse(sc.next());

                
                reservation.updateDates(checkIn, checkOut);
                System.out.println("Reservation: " + reservation);

                
            }catch(DomainExceptioin e){
                System.out.println("Error: " + e.getMessage());
                error = true;
            }   
        }while (error == true);  
            
        
        sc.close();

    }
}