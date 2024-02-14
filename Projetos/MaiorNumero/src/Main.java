import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vet;
        double aux=0, maior=0;
        int qtde, posicao=0;

        System.out.print("Quantos números você quer digitar? ");
        qtde = sc.nextInt();
        vet = new double[qtde];
        for(int i=0; i<qtde;i++){
            System.out.print("Digite um número: ");
            vet[i] = sc.nextDouble();
        }
        
       
        for(int i=0; i < qtde -1;i++){
        	for(int j=i+1;j<qtde;j++){
                if(vet[i] > vet[j]) {
                	aux=vet[i];
                	
                }
                
                if(maior < aux) {
                	maior=aux;
                }
            }
        	
        }
        System.out.printf("MAIOR VALOR = %.2f \n",maior);
        System.out.printf("POSIÇÃO DO MAIOR VALOR = %d",posicao);


        sc.close();
    }
}
