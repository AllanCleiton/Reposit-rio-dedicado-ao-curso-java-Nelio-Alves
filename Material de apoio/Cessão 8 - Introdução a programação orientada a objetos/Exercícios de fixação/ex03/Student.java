package ex03;

public class Student {
    private String name;
    private double nota1, nota2, nota3;

    public Student(String name, double nota1, double nota2, double nota3){
        this.name = name;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public void calNota(){
        double nota = this.nota1 + this.nota2 + this.nota3;
        if(nota > 60){
            System.out.println("FINAL GRADE = " +  nota);
            System.out.println("PASS");
        }else{
            System.out.println("FINAL GRADE = " +  nota);
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", 60 - nota); 

        }
     
    }

    public String toString(){
        return name + "\n" + nota1 + "\n" + nota2 + "\n" + nota3; 
    }
    
}
