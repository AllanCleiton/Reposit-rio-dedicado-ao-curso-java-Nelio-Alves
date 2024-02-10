package ex01;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        System.out.printf("Área: %.2f\n", retangulo.area(3.00, 4.00));
        System.out.printf("perimetro: %.2f\n", retangulo.perimeter(3.00, 4.00)); 
        System.out.printf("Diagonal: %.2f\n", retangulo.diagonal(3.00, 4.00));
        
               
    }
}
