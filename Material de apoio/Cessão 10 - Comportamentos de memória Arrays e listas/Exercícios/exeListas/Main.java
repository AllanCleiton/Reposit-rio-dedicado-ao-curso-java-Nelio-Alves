package exeListas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many emplyoees will be registered? ");
        int qtde = sc.nextInt();
        System.out.println();

        List<Emplyoee> emplyoees = new ArrayList<>();
        for(int i=0; i<qtde;i++){
            System.out.printf("Emplyoee #%d\n",i+1);
            System.out.print("Id: ");
            int id = sc.nextInt();
            
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            
            emplyoees.add(new Emplyoee(id, name, salary));
            System.out.println();
        }

        
        System.out.print("Enter the emplyoee id that will have salary increas: ");
        int id = sc.nextInt();
        if(emplyoees.stream().filter(x -> x.getId() == id).findFirst().orElse(null) != null){
            
            System.out.println("Enter the percentage: ");
            int percentage = sc.nextInt();
            emplyoees.stream().filter(x -> x.getId() == id).findFirst().orElse(null).almentarSalario(percentage);
        }else{
            System.out.println("This id does not exist! ");
        }
        
        System.out.println();
        System.out.println("List of emplyoees:");
        emplyoees.forEach(x -> System.out.println(x));
        sc.close();
    }   
}
