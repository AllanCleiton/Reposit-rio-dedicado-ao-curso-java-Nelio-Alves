package ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte qtde;
        double[] num;
        System.out.print("Quantos números você vai digitar? ");
        qtde = sc.nextByte();
        num = new double[qtde];


        for(int i = 0; i < qtde; i++){
            System.out.print("Digite um número: ");
            num[i] = sc.nextDouble();
        }

        double soma=0, media=0;
        System.out.print("VALORES = ");
        for(int i = 0; i < qtde; i++){
            System.out.print(num[i] + " ");
            soma += num[i];
            media = soma / qtde;
        }

        System.out.print("\nSOMA: "+ soma);
        System.out.print("\nMÉdia: "+ media);
        
        sc.close();
    }
}
