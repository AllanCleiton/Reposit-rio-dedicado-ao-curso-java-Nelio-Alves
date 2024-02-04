import java.util.Scanner;
import java.util.Locale;

public class Main{
    public static void main(String[] args){
        byte codePeca, codePeca_2;
        byte numPecas, numPecas_2;
        float precoPecas, precoPecas_2;
        float total;
        
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("informe o Codigo da peça: ");
        codePeca = sc.nextByte();
        System.out.print("Informe a quantidade de peças: ");
        numPecas = sc.nextByte();
        System.out.print("Informe o valor unitario da peça: ");
        precoPecas = sc.nextFloat();
        
        System.out.print("informe o Codigo da peça: ");
        codePeca_2 = sc.nextByte();
        System.out.print("Informe a quantidade de peças: ");
        numPecas_2 = sc.nextByte();
        System.out.print("Informe o valor unitario da peça: ");
        precoPecas_2 = sc.nextFloat();
        
        total = (numPecas*precoPecas) + (numPecas_2*precoPecas_2);
        System.out.printf("Total a pagar: %.2f", total);
        sc.close();
    }
}