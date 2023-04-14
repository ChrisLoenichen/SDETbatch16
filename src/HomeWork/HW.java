package HomeWork;

import java.util.Scanner;

public class HW {

        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            boolean isSunny;
            int temperature;
            System.out.println("Is it sunny outside?");
            String verySunny = scan.nextLine();

            if  (verySunny.equals("yes")){
                isSunny = true;
                System.out.println("It is a sunny day, I should go somewhere!");
                System.out.println("What is the temperature outside?");
                temperature = scan.nextInt();
                if (temperature>85){
                    System.out.println("I am going to the beach");
                }else {
                    System.out.println("I am going to the park!");
                }



            }else {
                isSunny = false;
                System.out.println("I stay home and practice Java");
            }


        }


}
