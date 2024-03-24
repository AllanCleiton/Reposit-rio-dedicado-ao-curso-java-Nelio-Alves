import java.util.List;

public class ServiceList{
    public static List<?> copy(List<? extends Number> source, List<? super Object> destino){
        for (Object object : source) {
            destino.add(object);
        }
        
        return destino;
    }
}