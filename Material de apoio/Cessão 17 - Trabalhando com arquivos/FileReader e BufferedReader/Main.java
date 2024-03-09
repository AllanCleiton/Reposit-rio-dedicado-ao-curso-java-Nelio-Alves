
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main{
    //@SuppressWarnings("resource")
    public static void main(String[] args) {
        String path = "C:\\Users\\allan\\Documents\\GitHub\\Repositorio-dedicado-ao-curso-java-Nelio-Alves\\Material de apoio\\Cessão 17 - Trabalhando com arquivos\\lendo arquivo texto com as classes File e Scanner\\vin.txt";

        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }finally{
            try {
                if(br != null){
                    br.close();
                }
                if (fr != null){
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}