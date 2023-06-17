package HomeWork;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

/*
2) You are a loan specialist and you need to ask user what is the amount of loan
is needed. If loan is less or equal to 200,000 then you would lend the money
otherwise you would reject the client.
 */
public class WK3LoanHW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! We are happy to help with your loan. What is the total amount for the loan needed?");
        int loan = scanner.nextInt();
        if (loan > 200000) {
            System.out.println("We are sorry, that exceeds the limit of your loan parameters. Please enter another amount.");
        } else {
            System.out.println("Congratulations! Your loan has been approved!");
        }
    }
}
