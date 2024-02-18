import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main{
    public static void main(String[] args) {
        //Data Hora para Texto Formato Customizado
        LocalDate d04 = LocalDate.parse("1994-10-03");
        LocalDateTime d05 = LocalDateTime.parse("2024-02-18T13:42");
        Instant d06 = Instant.parse("2024-02-18T16:49:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("d04 = " + d04.format(fmt1));
        System.out.println("d04 = " + fmt1.format(d04));
        System.out.println();
        System.out.println("d05 = " + d05.format(fmt1));
        System.out.println("d06 = " + d05.format(fmt2));
        System.out.println();
        System.out.println("d06 = " + fmt3.format(d06));
        System.out.println();
        System.out.println("d05 = " + d05.format(fmt4));
        System.out.println();
        System.out.println("d05 = " + fmt5.format(d06));

        
    }
}