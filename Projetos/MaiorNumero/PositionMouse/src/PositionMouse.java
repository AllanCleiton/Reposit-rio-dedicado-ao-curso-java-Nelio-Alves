import java.awt.MouseInfo;
import java.awt.Point;

public class PositionMouse {

    public static void main(String[] args) {
        // Obtém a posição inicial do mouse
        Point lastMouseLocation = MouseInfo.getPointerInfo().getLocation();
        // Variavel responsavel por dizer se o mouse se moveu
        boolean moved =false;
        while (true) {
            moved = false;
            // Obtém a posição atual do mouse
            Point currentMouseLocation = MouseInfo.getPointerInfo().getLocation();

            // Verifica se a posição atual é diferente da posição anterior
            if (!currentMouseLocation.equals(lastMouseLocation)) {
                lastMouseLocation = currentMouseLocation; // Atualiza a posição anterior
                moved = true;
            }else{
                moved = false;
            }

            // Aguarda um curto período de tempo antes de verificar novamente
            try {
                Thread.sleep(1000); // Espera 100 milissegundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (moved) {
                System.out.printf("X = %d\n", MouseInfo.getPointerInfo().getLocation().x);
                System.out.printf("Y = %d\n", MouseInfo.getPointerInfo().getLocation().y);
            }
        }
    }
    
}