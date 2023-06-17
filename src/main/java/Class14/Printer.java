package Class14;

public class Printer {
    void printWord(String word){
        System.out.println(word);
    }
    /*
    void=> return type of the method void mean this method does not return any data
    other examples of return types can be String in boolean char Dog1 cat whatever
    printWord => is the name of the method
    (String word)=> parameters/inputs
    {System.out.print(word} => body of the method you can write if else conditions loops if statements variables of other classes everything***
     */


    public static void main(String[] args) {
        //we are creating an object of the Printer class
        //in java all the classes can be treated as data types
        //new Printer()=> creating the object of the Printer class
        Printer obj= new Printer();
        // we are calling the printWord() method on obj object and passing "java" as
        // argument of input
        obj.printWord("Java");


    }
}
