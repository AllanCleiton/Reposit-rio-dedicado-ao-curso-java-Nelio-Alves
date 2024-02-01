import java.util.Locale;

public class Main{
    public static void main(String[] args) {
        String product1 = "computer";
        String product2 = "Office desk";

        byte age = 30;
        short code = 5290;
        char gender = 'F';

        double prince1 = 2100.0;
        double prince2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f %n", product1, prince1);
        System.out.printf("%s, which price is $ %.2f %n%n", product2, prince2);

        System.out.printf("Record: %d years old, code %d and gender: %c %n%n", age, code, gender);

        System.out.printf("Measure with eight decimal places: %f",measure);
        System.out.printf("Rouded (three decimal places): %.3f %n",measure);

        Locale.setDefault(Locale.US);

        System.out.printf("US decimal point: %.3f", measure);

    }
}