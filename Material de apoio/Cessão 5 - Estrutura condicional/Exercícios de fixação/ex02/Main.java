package ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte num;
        System.out.println("digite um numero: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextByte();
        if (num%2!=0){
            System.out.println("IMPAR");
        }else {
            System.out.println("Par");
        }
        sc.close();
    }
}
