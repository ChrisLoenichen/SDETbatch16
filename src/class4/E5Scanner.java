package class4;

import java.util.Scanner;

public class E5Scanner {
    public static void main(String[] args) {
        /*
scanner => is a class that knows how to take input from the keyboard
scan => is a variable of scanner like String
new => special keyword which creates the object of a class
scanner => again with paranthesis ()
System.in =>means we are using scanner for user input
so whenever we need user input we need this entire piece of code
        */
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter your name");
        // calling the next method to take a string from the user
        String name = scanner1.next();
        System.out.println("You are amazing "+name);
    }
}
