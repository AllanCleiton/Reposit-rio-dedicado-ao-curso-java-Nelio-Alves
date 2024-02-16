package exeListas;

public class Emplyoee{
    private int id;
    private String name;
    private double salary;
    public Emplyoee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }

    public void almentarSalario(double percentage){
        this.salary += (this.salary/100)*percentage;
    }

    public String toString(){
        return  id 
                + ", " 
                + name
                + ", "
                + String.format("%.2f", salary);
    }
}