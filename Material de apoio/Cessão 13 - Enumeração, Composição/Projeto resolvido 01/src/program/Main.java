package program;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.Color;
import entities.enums.WorkerLevel;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        
        
        Worker worker;
        

        if(true){
            System.out.print(Color.ANSI_GREEN + "Enter department's name: "+Color.ANSI_RESET);
            String departmentName = sc.nextLine();
            System.out.println(Color.ANSI_GREEN +"Enter worker data: "+Color.ANSI_RESET);
            System.out.println();

            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Level: ");
            String level = sc.nextLine();
            System.out.print("Base salary: ");
            double baseSalary = sc.nextDouble();

            worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(departmentName));
        }

        System.out.print("How many contracts to this worker? ");
        int nContracs = sc.nextInt();
        sc.nextLine();

        for (int i=0;i < nContracs;i++){
            System.out.printf("Enter the contract #%d data:\n", (i+1));
            System.out.print("Date (DD/MM/YYYY): ");
            
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy");
            LocalDate date = LocalDate.parse(sc.nextLine(), formatter);

            System.out.print("Value oer hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int duration = sc.nextInt();
            sc.nextLine();

            HourContract contract = new HourContract(date, valuePerHour, duration);
            worker.addContract(contract);
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.nextLine();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income: for " + monthAndYear + ": " + worker.income(year, month));

        
        sc.close();
    }
}
