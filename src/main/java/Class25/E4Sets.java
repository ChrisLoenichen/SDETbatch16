package Class25;

import java.util.LinkedHashSet;

public class E4Sets {
    public static void main(String[] args) {
        //no duplicates but it will remember the order with LinkedHashSet

        LinkedHashSet<String> fruit = new LinkedHashSet<>();
        fruit.add("Kiwi");
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Apple");
        System.out.println(fruit);
    }
}
