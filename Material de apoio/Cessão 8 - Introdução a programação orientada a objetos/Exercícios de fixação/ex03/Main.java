package ex03;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student(sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        
        student.toString();
        
        student.calNota();
    
        sc.close();
    }
}
