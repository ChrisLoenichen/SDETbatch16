package HomeWork;

import java.util.Scanner;

/*
4)Create a Java program that will ask user to input city and temperature.
Your program should convert Fahrenheit into celsius and print “The temperature is
the city __ is __”

 */
public class WK3TempHW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi there! What city are you in?");
        String city = scanner.nextLine();
        System.out.println("What is the temperature in your city today?");
        int temperature = scanner.nextInt();
        temperature = (temperature - 32) * 5 / 9;
        System.out.println("For those abroad, the city of " + city + " is " + temperature + " degrees celsius today.");
    }
}
