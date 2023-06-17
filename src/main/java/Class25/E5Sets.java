package Class25;

import java.util.TreeSet;

public class E5Sets {
    public static void main(String[] args) {
//no duplicates but it will sort the data based on the first characters
        TreeSet<String> fruit= new TreeSet<>();
        fruit.add("Mango");
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Kiwi");
        fruit.add("Banana");
        System.out.println(fruit);
    }
}
