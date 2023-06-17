package Class23;

import java.util.ArrayList;

public class E2Collections {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Mocef");
        names.add("Chris");
        names.add("Kiah");
        names.add("Ofelia");
        names.add("Karri");
        names.add("Farwa");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.contains("Chris"));
        System.out.println(names.get(0));
        names.remove("Mocef");
        System.out.println(names);
    }
}
