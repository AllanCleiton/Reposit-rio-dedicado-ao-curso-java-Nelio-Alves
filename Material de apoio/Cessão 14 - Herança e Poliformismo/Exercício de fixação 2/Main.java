import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> taxPayers = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int numberOfpayers = sc.nextInt();
        
        for(int i = 0; i < numberOfpayers; i++){
            System.out.println("Tax payer #"+ (i+1) +" data:");
            
            System.out.print("Individual or company (i/c)? ");
            char choice = sc.next().charAt(0);
            sc.nextLine();
            if(choice == 'i'){
                System.out.print("Name: ");
                String name = sc.nextLine();
                
                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();
                
                System.out.print("Health expenditures: ");
                double Health = sc.nextDouble();

                taxPayers.add(new Individual(name, anualIncome, Health));
            }else if(choice == 'c'){
                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();

                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();

                taxPayers.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }

        System.out.println();

        System.out.println("TAXES PAID:");
        double totalTax = 0.0;
        for (TaxPayer taxPayer : taxPayers) {
            System.out.println(taxPayer.toString());
            totalTax += taxPayer.tax();
        }

        System.out.printf("TOTAL TAXES: $ %.2f", totalTax);

        sc.close();
    }
}
