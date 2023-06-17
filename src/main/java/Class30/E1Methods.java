package Class30;

public class E1Methods {

    public static void main(String[] args) {
/*
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello World");
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello Java");
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello Batch16");
        }*/
        printWord("Hello World");
        printWord("hello java");
        printWord("hello batch16");

    }

    static void printWord(String word) {
        for (int i = 0; i < 3; i++) {
            System.out.println(word);

        }
    }
}
