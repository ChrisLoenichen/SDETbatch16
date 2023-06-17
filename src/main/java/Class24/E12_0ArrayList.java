package Class24;
//create an array list of all the drinks and call it. if any of them have "a" or "e" replace it with water
import java.util.ArrayList;

public class E12_0ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Coke");
        names.add("Coffee");
        names.add("Water");
        names.add("juice");

        for (int i = 0; i < names.size(); i++) {

            String word = names.get(i);
            if(word.contains("e")||word.contains("a")){
                names.set(i, "Water");
            }
    }
        System.out.println(names);
}
}
