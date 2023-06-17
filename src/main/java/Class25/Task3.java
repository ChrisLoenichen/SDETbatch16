package Class25;

import java.util.TreeSet;

/*
Create a Set of cities in which you want to make sure that insertion order is maintained. Then remove any city that starts with “A”;
 */
public class Task3 {
    public static void main(String[] args) {
        TreeSet<String> cities = new TreeSet<>();
        cities.add("Springfield");
        cities.add("Richmond");
        cities.add("Burke");
        cities.add("Fairfax");
        cities.add("Annandale");

        cities.removeIf(x->x.startsWith("A"));
        System.out.println(cities);
        }
    }

