import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Op01Instanciacao{
    public static void main(String[] args) {

    // INSTANCIAÇÃO - (AGORA) P/ DATA HORA
    System.out.println(Color.ANSI_PURPLE + "---INSTANCIAÇÃO - (AGORA) P/ DATA HORA---" + Color.ANSI_RESET);
        LocalDate dataAgora = LocalDate.now();
        System.out.println(dataAgora);
        System.out.println();

        LocalDateTime dataHoraAgora = LocalDateTime.now();
        System.out.println(dataHoraAgora);
        System.out.println();
    
        Instant dataHoraGlobalAgora = Instant.now();
        System.out.println(dataHoraGlobalAgora);
        System.out.println();
        
    //iNSTANCIAÇÃO - TEXTO ISO P/ DATA HORA
    System.out.println(Color.ANSI_PURPLE + "---iNSTANCIAÇÃO - TEXTO ISO P/ DATA HORA---" + Color.ANSI_RESET);
        LocalDate texoDataIso = LocalDate.parse("2024-02-20");
        System.out.println(texoDataIso);
        System.out.println();

        LocalDateTime textoDataHora = LocalDateTime.parse("2024-02-20T14:47");
        System.out.println(textoDataHora);
        System.out.println(); 

        Instant textoDataHoraGlobal = Instant.parse("2024-02-20T14:41:00Z");
        System.out.println(textoDataHoraGlobal);
        System.out.println();

    //INSTANCIAÇAO - TEXTO FORMATO CUSTOMIZADO P/ DATA HORA
    System.out.println(Color.ANSI_PURPLE + "---INSTANCIAÇAO - TEXTO FORMATO CUSTOMIZADO P/ DATA HORA---" + Color.ANSI_RESET);
        DateTimeFormatter txtCustonDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(LocalDate.parse("20/02/2024", txtCustonDataHora));
        System.out.println();

        DateTimeFormatter txtCustonDataHoraTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println(LocalDateTime.parse("20/02/2024 19:55", txtCustonDataHoraTime));
        System.out.println();

    //INSTANCIAÇÃO - DIA, MÊS, ANO, [HORARIO] P/ DATA HORA LOCAL
    System.out.println(Color.ANSI_PURPLE +"INSTANCIAÇÃO - DIA, MÊS, ANO, [HORARIO] P/ DATA HORA LOCAL" + Color.ANSI_RESET);
        LocalDate dadosIsolados = LocalDate.of(2024, 02, 20);
        System.out.println(dadosIsolados);
        System.out.println();

    }
}