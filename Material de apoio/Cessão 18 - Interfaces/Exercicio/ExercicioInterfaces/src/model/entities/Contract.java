package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private static final DateTimeFormatter fmr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    Integer number;
    LocalDate date;
    Double totalValue;

    List<Installment> installments = new ArrayList<>();

    public Contract(Integer number, LocalDate date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public LocalDate getDate() {
        return date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void addInstallment(Installment installment){
        installments.add(installment);
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Parcelas:\n");
        for (Installment installment: installments){
            builder.append(fmr.format(installment.getDueDate()));
            builder.append(" - ");
            builder.append(String.format("%.2f\n", installment.getAmount()));
        }
        return builder.toString();
    }
}
