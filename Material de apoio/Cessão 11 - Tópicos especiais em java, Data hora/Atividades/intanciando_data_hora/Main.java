
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Main{
    public static void main(String[] args) {
        //(AGORA) -> DATA-HORA 
        LocalDate d01 = LocalDate.now(); 
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        //TEXTO ISO 8601 -> DATA-HORA
        LocalDate d04 = LocalDate.parse("1994-10-03");
        LocalDateTime d05 = LocalDateTime.parse("1994-10-03T18:10:26");
        Instant d06 = Instant.parse("1994-10-03T18:10:26Z");
        Instant d07 = Instant.parse("1994-10-03T18:10:26-03:00");

        //TEXTO NO FORMATO CUSTOMIZADO -> DATA-HORA
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyy");
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 13:11", DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm"));

        //DIA , MÊS, ANO, [HORÁRIO] -> DATA-HORA LOCAL 
        LocalDate d10 = LocalDate.of(2024, 02, 18);
        LocalDateTime d11 = LocalDateTime.of(2024, 02, 18, 13, 23);


        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);

    }
}