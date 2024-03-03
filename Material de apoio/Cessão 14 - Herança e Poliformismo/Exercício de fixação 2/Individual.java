public class Individual extends TaxPayer {
    private double healthExpenditures;

    public Individual(){}


    public Individual(String name, double anualIcome, double healthExpenditures) {
        super(name, anualIcome);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        double tax = 0.0;
        if (anualIcome > 20000){
            tax = anualIcome / 100 * 25;
        }else{
            tax = anualIcome / 100 * 15;
        }

        double discount = healthExpenditures / 2;
        tax -= discount;
        return tax;
    }

    @Override 
    public String toString(){
        return getName() + ": $ " + String.format("%.2f", tax());
    }
    
}
