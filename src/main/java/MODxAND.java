import java.util.HashMap;
import java.util.Map;


public class MODxAND {
    public static void main(String[] args) {
        for (int i = 1; i < 64; i++) {
//            System.out.println("Testing "+i);
//            System.out.println("MOD " + (i % 16));
//            System.out.println("AND " + (i & 15));
            System.out.println("Equals? "+((i % 16) == (i & 15)));
        }
    }
}