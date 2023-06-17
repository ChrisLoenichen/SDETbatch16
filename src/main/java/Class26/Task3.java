package Class26;

import java.util.HashMap;

public class Task3 {
    public static void main(String[] args) {
        HashMap<Integer, String> BestBuy = new HashMap<>();
        BestBuy.put(1222, "Printer");
        BestBuy.put(1223, "Tv");
        BestBuy.put(1224, "Laptop");
        BestBuy.put(1225, "Ps5");
        BestBuy.put(1226, "speaker");

        //Set<Map .Entry<Integer,String>> entrySet = BestBuy.entrySet();
        //var entrySet = BestBuy.entrySet();
        for(var e : BestBuy.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
