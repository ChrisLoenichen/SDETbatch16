package ReviewClass15;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();//keys and values
        map.put("Apple", 3);
        map.put("Kiwi", 2);
        map.put("Orange", 4);
        map.put("Orange", 3);
        map.put("Apple", 30);
        System.out.println(map);
    }
}
