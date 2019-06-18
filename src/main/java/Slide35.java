import java.util.HashMap;
import java.util.Map;


public class Slide35 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(100, 0);
        map.put(90, 0);
        map.put(74, 0);

        System.out.println(map.get(74));
    }
}
