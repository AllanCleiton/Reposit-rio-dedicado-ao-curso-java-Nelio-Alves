package ex01;
    
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte num;
        System.out.println("Digite um número inteiro: ");
        num = sc.nextByte();
        if(num >= 0){
            System.out.println("NÂO NEGATIVO.");
        }else{
            System.out.println("NEGATIVO.");
        }
        sc.close();
        
    }   
}
