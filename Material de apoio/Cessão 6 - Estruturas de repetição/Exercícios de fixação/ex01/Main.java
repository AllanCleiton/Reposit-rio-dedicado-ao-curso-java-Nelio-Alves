package ex01;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        short senha;
        Scanner sc = new Scanner(System.in);
        
        senha = sc.nextShort();

        while(!(senha == 2002)){
            System.out.println("senha inválida");
            senha = sc.nextShort();
        }
        System.out.println("Acesso permitido");
        sc.close();
    }
}