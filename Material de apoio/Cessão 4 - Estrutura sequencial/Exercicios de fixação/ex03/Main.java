package ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short A,B,C,D;  
        int diferenca;
        System.out.println("Digite 4 números inteiros:");
        A = sc.nextShort();
        B = sc.nextShort();
        C = sc.nextShort();
        D = sc.nextShort();

        diferenca = A * B - C * D;

        System.out.println(diferenca);

        sc.close();
    }
}
