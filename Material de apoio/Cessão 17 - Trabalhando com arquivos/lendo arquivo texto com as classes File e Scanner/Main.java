import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\allan\\Documents\\GitHub\\Repositorio-dedicado-ao-curso-java-Nelio-Alves\\Material de apoio\\Cessão 17 - Trabalhando com arquivos\\lendo arquivo texto com as classes File e Scanner\\vin.txt");
        Scanner sc = null;

        try{
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally{
            if (sc != null){
                sc.close();
            }
        }
    }
}