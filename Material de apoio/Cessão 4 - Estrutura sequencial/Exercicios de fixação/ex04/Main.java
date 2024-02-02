package ex04;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte workerNum; 
        short workHours;
        float wageHours;
        float wage;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        workerNum = sc.nextByte();
        workHours = sc.nextShort();
        wageHours = sc.nextFloat();
        wage = wageHours*workHours;
        System.out.printf("Number = %d%n", workerNum);
        System.out.printf("Wage = U$ %.2f", wage);

        sc.close();
    }
}
