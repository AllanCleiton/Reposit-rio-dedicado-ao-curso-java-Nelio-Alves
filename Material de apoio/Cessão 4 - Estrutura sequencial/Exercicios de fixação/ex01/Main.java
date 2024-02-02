
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        byte n1;
        byte n2;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        n1 = sc.nextByte();
        System.out.print("Digite mais um numero: ");
        n2 = sc.nextByte();
        System.out.printf("A soma entre %d e %d é igual a %d", n1, n2, n1+n2);

        sc.close();
    }
}