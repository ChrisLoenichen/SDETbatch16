package Class26;

import java.util.*;

public class E3Maps {
    public static void main(String[] args) {
        Map<String, Double> drinks = new HashMap<>();

        //store prices and names of the items
        drinks.put("Coke",2.0);
        drinks.put("Milk", 5.0);
        drinks.put("Mango Juice", 2.5);
        drinks.put("Coffee", 3.0);
        drinks.put("Tea", 3.5);
        Set<Map.Entry<String,Double>>entrySet= drinks.entrySet();

//        for(Map.Entry<String, Double> e:entrySet){
//            System.out.println(e.getValue()+" "+e.getKey());
//        }
        //remove all of the entrie for which key contains the letter i and the valiue i sgreater than 2
            entrySet.removeIf(x->x.getKey().contains("i")&&x.getValue()>2);

        //nested map you can nest a list inside you can nest an array
        //List<Map<String,Double>> mapList = new ArrayList<>();
        //Map<String,List<Double>>






    }
}
