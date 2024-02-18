package ramdom;



import java.time.LocalDateTime;
import java.util.Random;


public class Hamdom {
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();
        
        for(int j=0; j<10;j++){
            System.out.println(rand.nextInt(LocalDateTime.now().getNano() ));
        }
        
        
        
        
        for(int i=0; i<10;i++){
            
            Thread.sleep(1000);
            System.out.println(LocalDateTime.now().getNano());
        }
    }
    

}
