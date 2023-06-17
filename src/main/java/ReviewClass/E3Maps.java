package ReviewClass;

import java.util.HashMap;
import java.util.Map;

public class E3Maps {
    public static void main(String[] args) {
        //no duplicate keys but duplicate values allowed
        //does not maintain insertion order because it is a hashmap
        //no remove if in the map class
        Map<String,Integer> map = new HashMap<>();
        map.put("Apple",3);
        map.put("Kiwi",2);
        map.put("Orange",4);
        map.put("Mango",3);
        map.put("Banana",30);
        System.out.println(map);
       //method chaining
        map.values().removeIf((x->x>3));
        System.out.println(map);

    }
}
