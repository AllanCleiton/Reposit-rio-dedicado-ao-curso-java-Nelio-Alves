package ex04;

public class CurrencyConverter{


    public static double converter(double dollar, double amount){
            double result =  amount * dollar;
            result += result*0.06;
            
        return result;
    }
}