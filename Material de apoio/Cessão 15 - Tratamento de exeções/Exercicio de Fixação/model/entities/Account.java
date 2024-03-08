package model.entities;

import model.exceptions.DomainException;

public class Account{
    private Integer number;
    private String holder;
    private Double balance;
    private Double withDrawnLimit;

    public Account(){}

    public Account(Integer number, String holder, Double balance, Double withDrawnLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withDrawnLimit = withDrawnLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithDrawnLimit() {
        return withDrawnLimit;
    }

    public void deposit(Double amount){
        this.balance += amount;
    }

    public void withDrawn(Double amount) throws DomainException{
        if(getBalance() <= 0){
            throw new DomainException("Operation invalid, you don't have enough balance");
        }
        if(amount > getWithDrawnLimit()){
            throw new DomainException("The requested amount exceeds the allowed limit ");
        }
        
        this.balance -= amount;
    }

    @Override 
    public String toString(){
        StringBuilder retorno = new StringBuilder();
        retorno.append("New balance: ");
        retorno.append(balance);
        return retorno.toString();
    }
}