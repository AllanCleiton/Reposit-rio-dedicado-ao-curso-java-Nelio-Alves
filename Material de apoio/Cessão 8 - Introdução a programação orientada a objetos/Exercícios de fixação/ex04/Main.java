package ex04;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
            System.out.print("What is the dollar prince? ");
            double dollar = sc.nextDouble();
            System.out.print("How many dollars will be bought? ");
            double quantity = sc.nextDouble();
            System.out.println("Amount to be paid in reais = " + CurrencyConverter.converter(dollar, quantity));
        sc.close();
    }
}
