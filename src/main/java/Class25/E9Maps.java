package Class25;

import java.util.TreeMap;

public class E9Maps {
    public static void main(String[] args) {

        TreeMap<String, Double> makeup = new TreeMap<>();
        makeup.put("Lipstick", 100.0);
        makeup.put("BlushOn", 68.0);
        makeup.put("EyeLiner", 80.0);
        makeup.put("Foundation", 120.0);
        makeup.put("Base", 25.0);

       var keys=  makeup.keySet(); //only getting the keys
        System.out.println(keys);

        //Collection<Double> value =makeup.values();
       var value = makeup.values();
        System.out.println(value);
    }
}
