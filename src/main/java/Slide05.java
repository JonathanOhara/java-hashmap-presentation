import java.util.Arrays;

public class Slide05 {

    public static void main(String[] args) {
        String newCountry;
        String[] countriesDatabase = new String[10];

        newCountry = "Ireland";
        countriesDatabase[hashFunction(newCountry)] = newCountry;

        newCountry = "Brazil";
        countriesDatabase[hashFunction(newCountry)] = newCountry;

        newCountry = "USA";
        countriesDatabase[hashFunction(newCountry)] = newCountry;

        newCountry = "Cuba";
        countriesDatabase[hashFunction(newCountry)] = newCountry;

        newCountry = "Russia";
        countriesDatabase[hashFunction(newCountry)] = newCountry;

//        newCountry = "Argentina";
//        countriesDatabase[hashFunction(newCountry)] = newCountry;
        Arrays.stream(countriesDatabase).forEach(System.out::println);
    }

    static int hashFunction(String name){
        int position = name.charAt(0) % 10;
        return position;
    }

}
