package ex02;

public class Funcinario {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public void inclreaseSalary(double percentage){
        this.grossSalary += grossSalary * percentage/100; 
    }

    public String toString(){
        return name + ", $" + String.format("%.2f", netSalary());

    }

    public void info(){
        System.out.printf("\nName: %s\n", name);
        System.out.printf("Gross salary: %.2f\n", grossSalary);
        System.out.printf("Tax %.2f\n", tax);
    }
    
}
