import model.entities.ItemSale;


import org.json.simple.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\allan\\Documents\\GitHub\\Repositorio-dedicado-ao-curso-java-Nelio-Alves\\Material de apoio\\Cessão 17 - Trabalhando com arquivos\\Exercicio";
        List<ItemSale> sales = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path + "\\vendas.csv"))){
            String line = br.readLine();


            while(line != null){
                String[] itemOfSale = line.split(",");
                String name = itemOfSale[0];
                Double price = Double.parseDouble(itemOfSale[1]);
                Integer quantity = Integer.parseInt(itemOfSale[2]);

                sales.add(new ItemSale(name, price ,quantity));

                line = br.readLine();

            }

            boolean pathOut = new File(path + "\\saida").mkdir();

            if(pathOut){
                
                try(BufferedWriter bw = new BufferedWriter(new FileWriter(path + "\\saida" +"\\summery.csv"))){
                
                    for(ItemSale sale : sales){
                        bw.newLine();
                        bw.write(sale.getName() + "," + String.format("%.2f", sale.ValueTotal()));
                    }
                    

                }catch(IOException e){
                    System.out.println("Error: 2 " + e.getMessage());

                }
            }
            

        } catch (IOException e) {
            System.out.println("Error: 1" + e.getMessage());
        }

        
        
    }
}
