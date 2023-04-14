package HomeWork;

import java.util.Arrays;


//Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
public class ArraysHW4 {
    public static void main(String[] args) {
        String [] cars = {"Toyota","Honda","Hummer","Ford","Jeep","Volks"};

        for (int i = 0; i < cars.length; i++) {

            System.out.println(cars[i]);
        }
        int a = 0;
        while (a <cars.length){
            System.out.println(cars[a]);
            a++;

        }

    }
}


