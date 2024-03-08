package textoToDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;


public class Main{

    public static void main(String[] args) throws ParseException{

        //data e hora local atual new Date();
        System.out.println(Color.ANSI_RED + "BLOCO 1" + Color.ANSI_RESET);
        System.out.println("Instanciando data e hora local atual");
            System.out.println(new Date() + "\n");

            //data e hora global atual Instant.now();
            System.out.println(Instant.now() + "\n");

    
        //Formatando datas com a Classe SimpleDateFormat:
        System.out.println(Color.ANSI_RED + "BLOCO 2" + Color.ANSI_RESET); 
        System.out.println("//Formatando datas com a Classe SimpleDateFormat:");

            SimpleDateFormat padrao_1 = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat padrao_2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            //Passando uma data personalizada para um Objeto Date usando o método .parse();
            System.out.println(" //Passando uma data personalizada para um Objeto Date usando o método .parse();");
                
                Date DataPersonalizada_1 = padrao_1.parse("06/03/2024");
                System.out.println("Data pesonalizada 1: "+ DataPersonalizada_1);
                Date DataPersonalizada_2 = padrao_2.parse("06/03/2024 22:07:10");
                System.out.println("Data personalizada 2: "+ DataPersonalizada_2);
                
                System.out.println();
            //Imprimindo uma Objeto do tipo date em formato personalizado usando o método .format();
            System.out.println(" //Imprimindo uma Objeto do tipo date em formato personalizado usando o método .format();");
                
                System.out.println(padrao_1.format(new Date()));
                System.out.println(padrao_2.format(new Date()));
            System.out.println();

        //Instanciando uma data no formato iso-8601
        System.out.println(Color.ANSI_RED + "BLOCO 3" + Color.ANSI_RESET); 
        System.out.println("//Instanciando uma data no formato iso-8601");
        SimpleDateFormat format_3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        format_3.setTimeZone(TimeZone.getTimeZone("GMT"));
        
        Date iso_8601 = Date.from(Instant.parse("2024-03-07T18:16:20Z"));
        System.out.println("iso 8601: " + format_3.format(iso_8601));


        
    }
}