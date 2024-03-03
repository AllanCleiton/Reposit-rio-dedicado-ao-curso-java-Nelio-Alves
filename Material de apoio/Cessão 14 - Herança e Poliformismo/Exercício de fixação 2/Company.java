public class Company extends TaxPayer{

    private int numberOFEmployee;
    
    public Company(){}

    
    
    public Company(String name, double anualIcome, int numberOFEmployee) {
        super(name, anualIcome);
        this.numberOFEmployee = numberOFEmployee;
    }



    @Override
    public double tax() {
        double tax = 0.0;
        if (numberOFEmployee > 10){
            tax = anualIcome / 100 * 14;
        }else{
            tax = anualIcome /100 * 16;
        }
        return tax;
    }
    
    @Override 
    public String toString(){
        return getName() + ": $ " + String.format("%.2f", tax());
    }
}
