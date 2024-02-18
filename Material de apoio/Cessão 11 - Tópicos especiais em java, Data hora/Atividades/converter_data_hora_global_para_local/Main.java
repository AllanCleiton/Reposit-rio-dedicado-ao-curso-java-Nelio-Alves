import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        
        LocalDate d04 = LocalDate.parse("1994-10-03");
        LocalDateTime d05 = LocalDateTime.parse("2024-02-18T13:42");
        Instant d06 = Instant.parse("2024-02-19T01:30:26Z");
        
        //Converter data-hora global para local
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));

        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("GMT-5"));//Estados Unidos


        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println();
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        //Obter dados de uma data-hora local
        System.out.println("d04 dia = " +d04.getDayOfMonth());
        System.out.println("d04 mes = " +d04.getMonthValue());
        System.out.println("d04 ano = " +d04.getYear());

        System.out.println("d05 hora = " +d05.getHour());
        System.out.println("d05 hora = " +d05.getMinute());


    }    
}
