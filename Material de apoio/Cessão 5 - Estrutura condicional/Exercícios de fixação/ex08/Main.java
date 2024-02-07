package ex08;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double salario, imposto = 0, _8porcento = 0, _18porcento = 0, _28porcento = 0;

        salario = sc.nextDouble();

        if (salario > 4500.00){
            _28porcento = (salario - 4500.00) * 0.28;
            _18porcento = 1500 * 0.18;
            _8porcento = 1000 * 0.08;
            imposto = _28porcento + _18porcento + _8porcento;
            System.out.printf("R$ %.2f", imposto);
        }else if(salario > 3000.00){
            _18porcento = (salario - 3000.00) * 0.18;
            _8porcento = 1000 * 0.08;
            imposto = _28porcento + _18porcento + _8porcento;
            System.out.printf("R$ %.2f", imposto);
         }else if(salario > 2000.00){
            _8porcento = (salario - 2000.00) * 0.08;
            imposto = _28porcento + _18porcento + _8porcento;
            System.out.printf("R$ %.2f", imposto);
         }else{
            System.out.println("Isento");
         }

         

        

        sc.close();
    }
}
