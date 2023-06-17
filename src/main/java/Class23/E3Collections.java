package Class23;

import java.util.ArrayList;

public class E3Collections {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Mocef");
        names.add("Chris");
        names.add("Kiah");
        names.add("Ofelia");
        names.add("Karri");
        names.add("Farwa");

        names.remove("Farwa");//can remove using index or value
        names.remove(0);

        System.out.println(names.indexOf("Karri"));
        //names.clear();
        System.out.println(names);
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
