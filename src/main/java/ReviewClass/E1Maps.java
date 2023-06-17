package ReviewClass;

import java.util.HashMap;
import java.util.Map;

public class E1Maps {
    public static void main(String[] args) {
        //no duplicate keys but duplicate values allowed
        //does not maintain insertion order because it is a hashmap
        Map<String,Integer> map = new HashMap<>();
        map.put("Apple",3);
        map.put("Kiwi",2);
        map.put("Orange",3);
        map.put("Mango",3);
        map.put("Apple",3);


    }
}
