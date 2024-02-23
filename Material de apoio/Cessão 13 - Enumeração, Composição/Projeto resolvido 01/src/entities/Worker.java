package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private List<HourContract> hourContracts = new ArrayList<>();
    private Department department;
    
    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public List<HourContract> getHourContracts() {
        return hourContracts;
    }

    public Department getDepartment() {
        return department;
    }

    public void addContract(HourContract contract){
        hourContracts.add(contract);
    }

    public void removeContract(HourContract contract){
        hourContracts.remove(contract);
    }

    public double income(int year, int month){
        double sum = baseSalary;
        
        
        for (HourContract c : hourContracts) {
            int c_year = c.getDate().getYear();
            int c_manth = c.getDate().getMonthValue();
            
            if (c_year == year && c_manth == month){
                sum += c.totalValue();
            }
        
        }
        return sum;
    }
}