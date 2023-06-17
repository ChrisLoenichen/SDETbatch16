package class4;

import java.util.Scanner;

public class E9ScannerBoolean {
    public static void main(String[] args) {
        Scanner bool= new Scanner(System.in);
        System.out.println("Are you hungry? y/n");
        boolean hungry= bool.nextBoolean();
        if(hungry){
            System.out.println("Lets order pizza");
        } else{
            System.out.println("Lets do some Java");
        }
    }
}
