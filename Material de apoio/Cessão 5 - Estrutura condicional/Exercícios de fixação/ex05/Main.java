package ex05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int codigo = 0, qtde = 0;
        double total;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o código do produto: ");
        codigo = sc.nextInt();
        System.out.print("Infome a quantidade: ");
        qtde = sc.nextInt();

        switch (codigo) {
            case 1:
                total = qtde * 4.0;
                System.out.printf("Total: R$ %.2f", total);
                break;
            case 2:
                total = qtde * 4.5;
                System.out.printf("Total: R$ %.2f", total);
                break;
            case 3:
                total = qtde * 5.0;
                System.out.printf("Total: R$ %.2f", total);
                break;
            case 4:
                total = qtde * 2.0;
                System.out.printf("Total: R$ %.2f", total);
                break;
            case 5:
                total = qtde * 1.5;
                System.out.printf("Total: R$ %.2f", total);
                break;
            default:
                System.out.println("Código do produto não encontrado.");
                break;
        }
        sc.close();
    }
}
