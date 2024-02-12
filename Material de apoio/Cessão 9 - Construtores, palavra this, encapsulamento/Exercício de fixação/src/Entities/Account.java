package Entities;

public class Account {
    private int numberAccount;
    private Person client;
    private double balance=0;
    
    

    public Account(int numberAccount, Person client) {
        this.numberAccount = numberAccount;
        this.client = client;
    }

    public Account(int numberAccount, Person client, double value) {
        this.numberAccount = numberAccount;
        this.client = client;
        deposit(value);
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public Person getClient() {
        return client;
    }

    public double getBalance() {
        return balance;
    }

    
    public void deposit(double value){
        if(value > 0){
            this.balance += value;
        }else{
            System.out.println("invalid value, try again.");
        }  
    }

    public void withdraw(double value){
        
        if(value > 0){
            this.balance -= value + 5;
        }else{
            System.out.println("invalid value, try again.\n");
        }
        
    }   

    public void info(){
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f", getNumberAccount(), getClient().getName(), getBalance());
    }

    public String toString(){
        return "Account "
                + getNumberAccount()
                + ", Holder: "
                + getClient().getName()
                + ", Balance: $"
                + String.format("%.2f", getBalance());
    }

}
