package Class24;

import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args) {

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('D');
        characters.add('E');
        characters.add('W');
        System.out.println(characters);
        System.out.println(characters.indexOf('E'));

        System.out.println(characters.contains('W'));//true

        System.out.println(characters.isEmpty());//false
        characters.set(1, 'H');// replaces characters at specified index
        System.out.println(characters);

    }
}
