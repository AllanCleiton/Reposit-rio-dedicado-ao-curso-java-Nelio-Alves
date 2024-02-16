package prectice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Maria");
        lista.add("Alex");
        lista.add("Bob");
        lista.add("Ana");
        lista.add(2,"Marco");

        
        
        for (String x : lista) {
            System.out.println(x);
        }
        
        System.out.println("___________________________");

        lista.removeIf(x -> x.charAt(0) == 'M');
        
        lista.forEach(list -> System.out.println(list));

        System.out.println("___________________________");

        List<String> resut = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x : resut) {
            System.out.println(x);
        }

        System.out.println("___________________________");
        String name = lista.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
         
    }
}