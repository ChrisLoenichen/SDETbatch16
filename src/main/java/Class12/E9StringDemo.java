package Class12;

public class E9StringDemo {
    public static void main(String[] args) {
        String sentence="I don't see the SEARCH result";
        System.out.println(sentence.endsWith("result"));
        System.out.println(sentence.contains("see"));//will check for word anywhere in the sent
    }
}
