package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> curse_A = new HashSet<>();
        Set<Integer> curse_B = new HashSet<>();
        Set<Integer> curse_C = new HashSet<>();
        
        System.out.print("how meny students for course A? ");
        int quantidade = sc.nextInt();
        for(int i = 0;i < quantidade; i++){
            curse_A.add(sc.nextInt());
        }

        System.out.print("how meny students for course B? ");
        quantidade = sc.nextInt();
        for(int i = 0;i < quantidade; i++){
            curse_A.add(sc.nextInt());
        }

        System.out.print("how meny students for course C? ");
        quantidade = sc.nextInt();
        for(int i = 0;i < quantidade; i++){
            curse_A.add(sc.nextInt());
        }
        Set<Integer> alunos = new HashSet<>(curse_A);
        
        /*for (Integer alunoCursoA : curse_A) {
            alunos.add(alunoCursoA);
            for (Integer alunoCursoB : curse_B) {
                alunos.add(alunoCursoB);
                for (Integer alunoCursoC : curse_C) {
                    alunos.add(alunoCursoC);
                }
            }
        }*/
        alunos.addAll(curse_B);
        alunos.addAll(curse_C); 

        System.out.println("Total students: " + alunos.size());

        sc.close();

    }
}