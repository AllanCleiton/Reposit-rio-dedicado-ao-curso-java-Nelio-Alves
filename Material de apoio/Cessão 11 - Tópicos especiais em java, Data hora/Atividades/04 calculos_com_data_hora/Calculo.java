import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Calculo {
    public static void main(String[] args) {
        
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        //Data-Hora +/- tempo -> Data-Hora
        LocalDate pasWeekLocalDate = d04.minusDays(7);
        System.out.println("pasWeekLocalDate = " + pasWeekLocalDate);
        LocalDate nextWeekLocalDate = d04.plusDays(7);
        System.out.println("nextWeekLocalDate = "+ nextWeekLocalDate);

        System.out.println();

        LocalDateTime pasWeekLocalDateTime = d05.minusDays(7); //Subtrair um tampo... metodo minus<>()
        System.out.println("pasWeekLocalDateTime = " + pasWeekLocalDateTime);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7); //adicionar um tempo... plus<>()
        System.out.println("nextWeekLocalDateTime = "+ nextWeekLocalDateTime);

        System.out.println();

        Instant pasWInstant = d06.minus(7, ChronoUnit.DAYS);
        System.out.println("pasWInstant = " + pasWInstant);
        Instant nextWInstant = d06.plus(7, ChronoUnit.DAYS);
        System.out.println("nextWInstant + " + nextWInstant);

        System.out.println();

        //_______________________________________________________________________________________________________
        
        //Duração 
            // Use o metodo between da classe Duration para calcular a duração entre duas datas.
        Duration t1 = Duration.between(pasWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pasWeekLocalDateTime, d05);
        Duration t3 = Duration.between(pasWInstant, d06);


        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t1 horas = " + t1.toHours());
        System.out.println("t1 minutos = " + t1.toMinutes());
        
    }
    
}