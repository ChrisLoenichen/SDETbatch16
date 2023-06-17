package Class25;

import java.util.LinkedHashMap;

public class E8Maps {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> ranks = new LinkedHashMap<>();
        ranks.put(1,"James");
        ranks.put(2,"Adam");
        ranks.put(3,"John");
        ranks.put(4,"Jimi");
        System.out.println(ranks);
        ranks.remove(2);
        System.out.println(ranks);
        ranks.replace(1,"Adam");//replaces the element of the key
        System.out.println(ranks);

    }
}