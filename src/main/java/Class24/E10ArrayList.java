package Class24;

import java.util.ArrayList;
/*
methods from arraylist class
do not use Iterators use removeif();
 */
public class E10ArrayList {
    public static void main(String[] args) {


        ArrayList<String> rand = new ArrayList<>();
        rand.add("time");
        rand.add("dog");
        rand.add("wet");
        rand.add("juice");


        /*Iterator<String> iterator = rand.iterator();
        while (iterator.hasNext()){
            String word = iterator.next();
            if(word.endsWith("e")){
                iterator.remove();
            }
        }*/
        rand.removeIf(word->word.endsWith("e"));//same as above code
        //-> is from lambdas expressions
        System.out.println(rand);
    }
}
