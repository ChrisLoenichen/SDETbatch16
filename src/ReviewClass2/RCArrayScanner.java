package ReviewClass2;

import java.util.Scanner;
/*
create an array that stores numbers from a use and we want to calculate the average of numbers
 */
public class RCArrayScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many integers do you want to store");
        int size = scan.nextInt();

        int[] numbers = new int[size];
        for (int i = 0; i > numbers.length; i++) {
            System.out.println("Please enter " + (i +1) +" element");
            numbers[i]=scan.nextInt();
        }
    }
}
