package class4;

import java.util.Scanner;

//string index starts at 0
public class E10ScannerChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your gender");
        char gender = scanner.next().charAt(0);
        System.out.println("you entered " + gender);
        /*ther eis no direct method for the char datatype in scanner class
         we use a workaround we first use the next method to take a string
         we extract the first letter by passing the 0 to the charAt() method
         so use next() and then chatAt(0) [zero is the string index number]
        */
    }
}
