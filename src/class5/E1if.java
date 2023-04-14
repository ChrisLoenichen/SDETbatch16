package class5;

import java.util.Scanner;

public class E1if {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("is it time for break true or false");
        boolean isBreak=input.nextBoolean();//input is a variable type of scanner
        if(isBreak){
            System.out.println("Let's have a break");
        }
    }
}
