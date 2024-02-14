package ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet;
        int qtde, qtdePares=0;

        System.out.print("Quantos números você quer digitar? ");
        qtde = sc.nextInt();
        vet = new int[qtde];
        for(int i=0; i<qtde;i++){
            System.out.print("Digite um número: ");
            vet[i] = sc.nextInt();
        }
        
        System.out.println("NÚMEROS PARES:");
        for(int i=0; i<qtde;i++){
            if(vet[i] % 2 == 0){
                System.out.print(vet[i] + " ");
                qtdePares++;
            }
        }
        System.out.printf("\nQuantidade de pares = %d", qtdePares);


        sc.close();
    }
}
