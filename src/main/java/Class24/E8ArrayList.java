package Class24;


import java.util.ArrayList;

public class E8ArrayList {
    public static void main(String[] args) {
        ArrayList<String> rand = new ArrayList<>();
        rand.add("time");
        rand.add("dog");
        rand.add("wet");
        rand.add("juice");

        /*for(String random : rand){
            if(random.endsWith("e")){
                rand.remove(random);
            }
        }*/

        for (int i = 0; i < rand.size(); i++) {
            String word = rand.get(i);
            if (word.endsWith("e")){
                rand.remove(i);
                i--;
            }
        }
        System.out.println(rand);



    }
}