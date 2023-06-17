package Class25;

import java.util.HashMap;
//Hashmap stores 2 pieces of info at the same time one acts as a key the other as the value
//map is not part of the collections framework
//we cannot use the same key again or it will override the previous key and delete previous
public class E7Maps {
    public static void main(String[] args) {
        HashMap<String, Double> grocery = new HashMap<>();
        grocery.put("Apple",20.5);
        grocery.put("Soap",3.1);
        grocery.put("Eggs",3.5);
        grocery.put("Milk",2.5);
        grocery.put("Apple",4.5);

        System.out.println(grocery);
        System.out.println(grocery.size());
        System.out.println(grocery.containsKey("Banana"));
        System.out.println(grocery.containsKey("Eggs"));
        System.out.println(grocery.containsValue(3.5));
        System.out.println(grocery.isEmpty());

    }
}
