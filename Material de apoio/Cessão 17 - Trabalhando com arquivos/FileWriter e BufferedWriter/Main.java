import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) {
        String[] lines  = new String[] {"good morning", "good afternoon", "good nigth"};

        String path = "C:\\Users\\allan\\Documents\\GitHub\\Repositorio-dedicado-ao-curso-java-Nelio-Alves\\Material de apoio\\Cessão 17 - Trabalhando com arquivos\\lendo arquivo texto com as classes File e Scanner\\vin.txt";
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for( String line : lines){
                bw.newLine();
                bw.write(line);
                
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}