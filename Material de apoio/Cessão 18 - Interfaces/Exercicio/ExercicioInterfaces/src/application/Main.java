package application;

import model.entities.Contract;
import model.services.ContractService;
import model.services.PaymentService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the contract details:");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine(); //buffer collected

        System.out.print("Date: ");
        LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.print("Contract value: ");
        double contractValue = sc.nextDouble();

        Contract contract = new Contract(number, date, contractValue);

        ContractService service = new ContractService( new PaymentService());

        System.out.print("Enter the instalments number: ");
        int instalmentNumber = sc.nextInt();

        service.processContract(contract, instalmentNumber);

        System.out.println(contract);

        sc.close();
    }
}
