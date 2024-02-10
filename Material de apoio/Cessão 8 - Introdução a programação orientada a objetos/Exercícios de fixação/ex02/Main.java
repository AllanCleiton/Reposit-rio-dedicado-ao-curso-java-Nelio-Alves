package ex02;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Name: ");
        Funcinario funcionario = new Funcinario();
        funcionario.name = sc.nextLine();
        
        System.out.print("Grss salary: ");
        funcionario.grossSalary = sc.nextDouble();
        
        System.out.print("Tax: ");
        funcionario.tax = sc.nextDouble();


        funcionario.info();

        System.out.printf("\nEmployee: " + funcionario);

        System.out.print("\nwhich percentage to increase salary? ");
        funcionario.inclreaseSalary(sc.nextDouble());
        System.out.println("Updated data: " + funcionario);

        sc.close();
    }
}
