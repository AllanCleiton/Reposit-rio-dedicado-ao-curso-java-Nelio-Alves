package calculos_com_data_hora;

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
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        LocalDateTime pasWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

        Instant pasWInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWInstant = d06.plus(7, ChronoUnit.DAYS);


        System.out.println("pasWeekLocalDate = " + pasWeekLocalDate);
        System.out.println("nextWeekLocalDate = "+ nextWeekLocalDate);
        System.out.println();
        System.out.println("pasWeekLocalDateTime = " + pasWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = "+ nextWeekLocalDateTime);
        System.out.println();
        System.out.println("pasWInstant = " + pasWInstant);
        System.out.println("nextWInstant + " + nextWInstant);

        //Duração 
        Duration t1 = Duration.between(pasWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pasWeekLocalDateTime, d05);
        Duration t3 = Duration.between(pasWInstant, d06);

        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
        
    }
    
}