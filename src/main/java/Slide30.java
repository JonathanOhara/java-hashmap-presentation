import java.util.HashMap;
import java.util.Map;


public class Slide30 {
    public static void main(String[] args) {
        int i = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(; i < 12; i++){
            map.put(i, 0);
        }

        System.out.println(map.size());

        map.put(12, 0); //here the resize will be called

        System.out.println(map.size());

    }
}
