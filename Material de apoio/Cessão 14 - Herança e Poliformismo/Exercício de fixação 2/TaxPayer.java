public abstract class TaxPayer {
    private String name;
    protected double anualIcome;

    public TaxPayer(){}

    public TaxPayer(String name, double anualIcome) {
        this.name = name;
        this.anualIcome = anualIcome;
    }

    public String getName() {
        return name;
    }

    public double getAnualIcome() {
        return anualIcome;
    }

    public abstract double tax();
}
