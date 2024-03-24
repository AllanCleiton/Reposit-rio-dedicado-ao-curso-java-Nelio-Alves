
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Integer> dominio = new ArrayList<>();
        
        //O custo de produção de camizetas em uma fabrica varia de acordo com a quantidade produzida.
        System.out.print("quantos simulações deseja fazer? ");
        Integer qtde = sc.nextInt();
        for(int i=0; i < qtde; i++){
            System.out.println("Quantos milhares de camizetas serão produzidas? ");
            dominio.add(sc.nextInt());
        }

       

        List<Double> imagem = dominio.stream().map(x -> (0.5*(x*x)) - (4*x) + 9).collect(Collectors.toList());
        
        for(int i=0; i < qtde; i++){
            System.out.println("custo de produção: " + dominio.get(i) + " será de: " + imagem.get(i) * 1000 + "$");
        }

        
        sc.close();
    }
}