package class4;

import java.util.Scanner;

public class bullShit {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter your age ");
        int age = user.nextInt();
        int oldAge=age+10;
        System.out.println("Your age after 10 years is " + oldAge);
    }
}

