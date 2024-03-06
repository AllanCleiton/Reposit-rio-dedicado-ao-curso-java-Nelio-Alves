import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        File file = new File("C:\\Users\\allan\\Documents\\GitHub\\Reposit-rio-dedicado-ao-curso-java-Nelio-Alves\\Material de apoio\\Cessão 15 - Tratamento de exeções\\estrutura finaly\\in.txt");

        Scanner sc = null;

        try {
            sc  = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error opering file: " + e.getMessage());
        }finally{
            sc.close();
        }
    }
}