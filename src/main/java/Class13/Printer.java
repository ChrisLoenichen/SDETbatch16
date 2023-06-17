package Class13;

//Method is a block of code that contains java code which is executed
//when we call that method.
//In java methods can only exist inside classes
public class Printer {
    void printSomething() {
        System.out.println("Hello Java");
        System.out.println("Hello Java");
        System.out.println("Hello Java");
        System.out.println("Hello Java");

    }//the following is more flexible

    void printWord(String word) {
        System.out.println(word);
        System.out.println(word);
        System.out.println(word);
        System.out.println(word);
    }

    void printAlot(String word, int number) {
        for (int i = 0; i < number; i++){
            System.out.println(word);
        }
    }

}
