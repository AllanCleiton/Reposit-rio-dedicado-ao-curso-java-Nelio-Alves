package ex02;

import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        final double pi = 3.14159;  
        double area; 
        double raio;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o valor do raio do circulo: ");
        raio = sc.nextDouble();
        area = pi * Math.pow(raio, 2);
        
        System.out.printf("A área do circulo é : %.4f", area);
        
        
        sc.close();
    }
}