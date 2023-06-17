package Class25;

import java.util.ArrayList;
import java.util.HashSet;


public class E3Sets {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Farwa");
        names.add("Farwa");
        System.out.println(names);

        //Hashsets do not allow duplicate data, other will be disguarded
        //Hashset will not give you the values in order in which you put them
        //no get method because data is not stored into indexes
        //no regular loops either becuase they use indexes, only enhanced for loop available
        HashSet<String> uniqueNames = new HashSet<>();
        uniqueNames.add("A");
        uniqueNames.add("K");
        uniqueNames.add("B");

        System.out.println(uniqueNames);
        for(String name: uniqueNames){
            System.out.println(name);
        }
    }
}
