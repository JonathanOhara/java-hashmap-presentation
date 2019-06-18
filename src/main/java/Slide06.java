import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Slide06 {

    static List<List<String>> hashTable = IntStream.range(0, 10)
                                .mapToObj(ArrayList<String>::new)
                                .collect(Collectors.toList());

    public static void main(String[] args) {

        put("Ireland");
        put("Brazil");
        put("USA");
        put("Cuba");
        put("Russia");
        put("Argentina");

        hashTable.stream().forEach(bucket -> bucket.forEach(System.out::println));

        System.out.println(get("Cuba"));
    }

    private static boolean get(String country) {
        List<String> buckets = hashTable.get(hashFunction(country));

        return buckets.stream().filter(c -> c.equals(country)).findFirst().isPresent();
    }

    private static void put(String country) {
        List<String> buckets = hashTable.get(hashFunction(country));

        buckets.add(country);
    }

    static int hashFunction(String name){
        int position = name.charAt(0) % 10;
        return position;
    }

}
