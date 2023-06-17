package HomeWork;

import java.util.Scanner;

/*
3)You are DMV representative and you need to ask customer their age.
If they are 18 and older you will issue a driver license to them, otherwise you
will offer them to get a learners permit.
 */
public class WK3DmvHW {
    public static void main(String[] args) {
        System.out.println("Hello, in order for the DMV to  further assist you please answer the following question. ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age= scanner.nextInt();
        if(age<18){
            System.out.println("We are sorry, we are only able to issue you a learners permit.");
        }else{
            System.out.println("Congratulations on your new drivers license!");
        }

    }
}
