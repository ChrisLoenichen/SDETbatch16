package Class7pt2;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enther number greater than 1");
        int lastNum= scan.nextInt();
        int count=1;
        while(count<=lastNum){
            System.out.print(count+" ");
            count++;
        }
    }
}

