package ex01;

public class Retangulo {
    private double width;
    private double heigth;

    public double area(double width, double heigth){
        this.width = width;
        this.heigth = heigth;
        return this.width * this.heigth;
    }

    public double perimeter(double width, double heigth){
        this.width = width;
        this.heigth = heigth;
        return 2*(this.width + this.heigth);
    }

    public double diagonal(double width, double heigth){
        this.width = width;
        this.heigth = heigth;
        return Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.heigth, 2));
    }


}