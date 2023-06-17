package Class25;

import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        TreeSet<String> countries = new TreeSet<>();
        countries.add("Mexico");
        countries.add("USA");
        countries.add("Canada");
        countries.add("Costa Rica");
        countries.add("Equador");
        System.out.println(countries);

        for(String country : countries){
            System.out.println(country);
        }

    }
}
