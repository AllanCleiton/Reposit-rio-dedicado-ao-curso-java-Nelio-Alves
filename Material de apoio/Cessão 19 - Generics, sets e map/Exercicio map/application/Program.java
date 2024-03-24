package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Program {
    public static void main(String[] args) {
        
        String path = "C:\\temp\\vin.txt";
        Map<String, Integer> totalVotos = new HashMap<>(); 

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            
            while (line != null) {
                String[] fields = line.split(",");

                if(totalVotos.containsKey(fields[0])){
                    int votos = totalVotos.get(fields[0]) + Integer.parseInt(fields[1]);
                    totalVotos.put(fields[0], votos);
                }else{
                    totalVotos.put(fields[0], Integer.parseInt(fields[1]));
                }
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }

        for(String key : totalVotos.keySet()){
            System.out.println(key + ": " + totalVotos.get(key));
        }
    }
}
