package class4;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name= scan.next();

        if(name.equals("Chris")){
            System.out.println("Hates mac");
        } else {
            System.out.println("Windows user");
        }
    }
}
