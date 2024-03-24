
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        List<Object> myObjects = new ArrayList<>();

        ServiceList.copy(numbers, myObjects);
        for (Object object : myObjects) {
            System.out.println(object);
        }
    }
}