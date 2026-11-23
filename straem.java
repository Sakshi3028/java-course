import java.util.ArrayList;
import java.util.List;

public class straem {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10,11));
        list.stream()
        .map(x->x*2)
       .forEach(System.out::println);

    }
}