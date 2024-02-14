package ex03;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
         
        alturas();
    }


    public static void alturas(){
        String nome;
        byte idade, menos16anos=0;
        float altura, alturaMedia=0;
        byte qtde=0;

        Pessoa[] pessoa;

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        qtde = sc.nextByte();
        pessoa = new Pessoa[qtde];

        for(int i=0; i<qtde; i++){
            System.out.printf("Dados da %da pessoa: \n", i+1);
            sc.nextLine();
            System.out.print("Nome: ");
            nome = sc.nextLine();
            System.out.print("Idade: ");
            idade = sc.nextByte();
            System.out.print("Altura: ");
            altura = sc.nextFloat();
            System.out.println();
            
            pessoa[i] = new Pessoa(nome, idade, altura);
        }

        float somaAlturas=0;
        for(int i=0; i<qtde; i++){
            somaAlturas += pessoa[i].getAltura();
            
            if(pessoa[i].getIdade() < 16){
                menos16anos+=1;

            }
        }
        alturaMedia = somaAlturas/qtde;
        
        System.out.printf("Altura média: %.2f \n",alturaMedia);

        float percentagem = (menos16anos*100)/qtde; 
        System.out.printf("Pessoas com menos de 16 anos: %.0f%c\n",percentagem, '%');
        
        for(int i=0; i<qtde; i++){
        
            if(pessoa[i].getIdade() < 16){
                System.out.println(pessoa[i].getNome());
                
            }
        }



        sc.close();
    }
}
