package class4;

import java.util.Scanner;

public class E7Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scan.next();

        if (name.equals("Chris")) {
            System.out.println("Hates mac");
        } else if (name.equals("Jack")) {
            System.out.println("Naughty");
        } else if (name.equals("Stinker")){
            System.out.println("Best");
        } else if (name.equals("Doucher")){
            System.out.println("The whole bag");
        } else {
            System.out.println("not loved");
        }
    }
}
