package Class12;

public class E8StringDemo {
    public static void main(String[] args) {
        String sentence="  JAVA is very easy";
        sentence=sentence.trim().toLowerCase();
        //method chaining and its possible with string class
        //System.out.println(sentence.startsWith("Java"));//spaces matter, also case sensitive
        System.out.println(sentence);
        System.out.println(sentence.startsWith("Java"));
    }
}
