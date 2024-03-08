package OperacoesComCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws ParseException {
        //Somando ou subtraindo uma unidade de tempo em uma data
        SimpleDateFormat formato_01 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2024-03-07T18:50:10Z"));
        System.out.println(formato_01.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 3);

        Date d2 = cal.getTime();
        System.out.println(formato_01.format(d2));

        //Obtendo uma unidade de tempo
        int minute = cal.get(Calendar.MINUTE);
        System.out.println("Minuto: " + minute);
        System.out.println("Month: " + (cal.get(Calendar.MONTH) + 1));

        //Difereça entre datas
        System.out.println("//Difereça entre datas");
        SimpleDateFormat formato_02 = new SimpleDateFormat("dd/MM/yyyy");
        Date inicio = formato_02.parse("07/03/2024");
        Date fim = formato_02.parse("10/03/2024");
        
        long diferenca = fim.getTime() - inicio.getTime();
        System.out.println("Dias " + TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS));

    }
}
