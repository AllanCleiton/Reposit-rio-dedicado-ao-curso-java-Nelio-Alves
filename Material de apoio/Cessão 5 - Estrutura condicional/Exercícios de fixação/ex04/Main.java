package ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A, B, duracao;           
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Qual a hora Inicial: ");
        A = sc.nextInt();
        System.out.print("Qual a hora final: ");
        B = sc.nextInt();

        if (A<B){
           duracao = B - A;
        }else{
            duracao = (24 - A) + B;
        }
        
        System.out.printf("O jogo durou %d hora(s)", duracao);
        sc.close();
    }
}

