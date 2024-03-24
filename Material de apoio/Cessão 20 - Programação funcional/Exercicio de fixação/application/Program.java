package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import model.entities.Employee;

public class Program{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Enter full file path: "); 


        try (BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()))){
            List<Employee> list = new ArrayList<>();
            String line = br.readLine();
            
            while (line!=null) {
                String[] filds = line.split(",");
                list.add(new Employee(filds[0], filds[1], Double.parseDouble(filds[2])));
                line = br.readLine();

            }

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            System.out.println("Email of people whose salary is more tham " + salary + ":");
            List<String> emails = list.stream()
                                    .filter(e -> e.getSalary() > salary)
                                    .map(e -> e.getEmail())
                                    .sorted((e1, e2) -> e1.toUpperCase().compareTo(e2.toUpperCase()))
                                    .collect(Collectors.toList());
            
            emails.forEach(System.out::println);

            Double somatorio = list.stream()
                                .filter(e -> e.getName().toUpperCase().charAt(0) == 'M')
                                .map(e -> e.getSalary())
                                .reduce(0.0, (x, y) -> x + y);
                                


            System.out.print("Sum of salary of people whose name starts with 'M': "  + somatorio);
            
 

        } catch (IOException e) {
           System.out.println("Error: " + e.getMessage());
        }
        
        sc.close();        
    }
}