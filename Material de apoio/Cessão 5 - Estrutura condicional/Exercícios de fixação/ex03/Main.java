package ex03;

import java.util.Scanner;

public class Main {
    /* NX=K 
     * K É MULTIPLO DE N SE E NOMENTE SE  X PERTENCER AOS INTEIROS
    */
    public static void main(String[] args) {
        double N,K,X;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois numeros para ver se são multiplos: ");
    
        N = sc.nextDouble();
        K = sc.nextDouble();
    
        X =  N/K;

        if(X % 2 == 0){
            System.out.println("São multiplos.");
        }else{
            System.out.println("Não são multiplos.");
        }

        sc.close();
    }
}
    
