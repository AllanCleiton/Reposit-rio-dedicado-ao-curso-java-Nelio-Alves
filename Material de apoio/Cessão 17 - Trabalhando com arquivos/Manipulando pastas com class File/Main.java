import java.io.File;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        //String strPath = sc.nextLine();
        String strPath = "C:\\Users\\allan\\Documents\\GitHub\\Repositorio-dedicado-ao-curso-java-Nelio-Alves\\Material de apoio\\Cessão 17 - Trabalhando com arquivos";
        File path = new File(strPath);
        
        //Mostrando as pastas contidas em uma pasta
        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("Folders: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        //Mostrando os aqruivos contidos em uma pasta
        File[] files = path.listFiles(File::isFile);
        System.out.println("Files: ");

        for (File file : files) {
            System.out.println(file);
        }

        //Criando uma sub pasta 
        boolean success = new File(strPath + "\\Informacoes_do_caminho_do_arquivo").mkdir();
        System.out.println("Directory crieted successfuly: " + success);

        sc.close();
    }
}