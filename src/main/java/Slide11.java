import java.util.HashMap;
import java.util.Map;

public class Slide11 {

    public static void main(String[] args) {
        Map<FakeObject, String> test = null;

        test = new HashMap<>();
        test = new HashMap<>(10);
        test = new HashMap<>(10, 10.0f);


        for(int i = 0; i < 100; i++)
            test.put(new FakeObject(i), "CURINTIA");

    }

}
class FakeObject{
    private int id;
    private static int COUNT = 0;

    public FakeObject(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FakeObject that = (FakeObject) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return COUNT++ % 25;
    }
}
