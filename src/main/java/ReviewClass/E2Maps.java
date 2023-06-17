package ReviewClass;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class E2Maps {
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
        map.remove("Orange");


        //in order to remove you have to store the keys into a set
        Set<String>keys = map.keySet();
        //x->x seach for this, if statement?
        keys.removeIf(x->x.contains("a") || x.contains("A"));
        System.out.println(map);

    }
}
