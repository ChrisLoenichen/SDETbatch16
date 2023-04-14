package ReviewClass1;

import java.util.Scanner;

public class WhileLoopScanner {
    public static void main(String[] args) {
        /*
        ask user to enter numbers 1 by 1
        until users a non integer value then loop should stop
        inside loop we need to calculate the sum of all entered numbers
         */
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter integer values");

        while (sc.hasNextInt()) {

            int num = sc.nextInt();
            //sum=sum+num;
            sum += num;
        }
    }
}
