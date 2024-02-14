package ex01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte num;
        
        do{
            System.out.println("Quantos números você que digitar? ");
            num = sc.nextByte();

        }while(!(num >= 0 && num <=10));

        short[] vetor = new short[num];
        for(int i = 0; i < num;i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextShort();
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for(int i = 0; i < num;i++){
            if(vetor[i] < 0){
                System.out.println(vetor[i]);
            }
        }

        
        sc.close();
    }
    
     
    
    
}
