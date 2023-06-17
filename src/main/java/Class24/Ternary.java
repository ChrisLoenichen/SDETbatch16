package Class24;

public class Ternary {
    public static void main(String[] args) {

        String word;
        if(10>8){
            word = "water";
        }else{
            word = "milk";
        }
        System.out.println(word);

        String word2 = 10>8?"Water":"milk";
        System.out.println(word2);
    }
}
