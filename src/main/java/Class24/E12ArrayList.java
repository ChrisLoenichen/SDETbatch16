package Class24;

import java.util.ArrayList;
//create an array list of drink aif any drink has a letter a or e replace it with water
public class E12ArrayList {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Coke");
        drinks.add("Sprite");
        drinks.add("Sierra Mist");
        drinks.add("Mello Yellow");

        for (int i = 0; i < drinks.size(); i++) {
            String word= drinks .get(i);
            if(word.contains("e")||word.contains("a")){
                drinks.set(i,"Water");}
            System.out.println(drinks);
        }
        drinks.replaceAll(x-> x.contains("a")||x.contains("e")?"water":x);
        System.out.println(drinks);

        String word = 10>8?"Water":"milk";
        //both are same, called ternary operator
        String word2;
        if(10>8){
            word2="Water";
        }else{
            word2= "milk";
        }
        System.out.println(drinks);


    }
}
