package Console_Comandos;

import java.io.IOException;

public class ComandosCMD {
    public static void cls(){
        try {
            // Executa o comando 'cls' no Windows ou 'clear' no Linux/Mac para limpar o console
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        
    }

    public static void Comando(String comando){
        try {
            // Executa o comando 'cls' no Windows ou 'clear' no Linux/Mac para limpar o console
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", comando).inheritIO().start().waitFor();
            } else {
                new ProcessBuilder(comando).inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        
    }
}
