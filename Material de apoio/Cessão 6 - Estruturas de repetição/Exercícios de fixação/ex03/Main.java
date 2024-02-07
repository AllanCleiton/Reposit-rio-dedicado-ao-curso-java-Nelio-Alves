package ex03;

import Console_Comandos.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int alcool = 0, gasolina= 0, diesel = 0, escolha=0;
        Scanner sc = new Scanner(System.in);
        ComandosCMD.cls();
        do{ 
            System.out.println("Escolha um tipo de combustivel:");
            System.out.println("1 - para Alcool");
            System.out.println("2 - para Gasolina");
            System.out.println("3 - para Diesel");
            System.out.println("4 - FIM");
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    alcool += 1;
                    break;
                case 2:
                    gasolina += 1;
                    break;
                case 3:
                    diesel += 1;
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
            ComandosCMD.cls();

        }while(escolha != 4); 
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        sc.close();

    }
    
    
    
}
