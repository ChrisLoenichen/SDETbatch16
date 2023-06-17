package Class15;

import java.util.Arrays;

/*
Methods: blocks of code which are executed when methods are called. Mehtods  in java java return types
(output of a method) for example void, String int char etc.
They can also take parameters (input). Parameters can be of primitive and non primitive.
The body of the method can contain any kind of logic like arrays loops switch
why use? code reusability, organized code, changing code become easier

The createArray(size) method takes an integer parameter size and creates an array of that size.
it then fills the array with the number 10 using a for loop and finally returns the array
createArray10 10 10 10 10
createArray 10 10 10

 */
public class E1 {

    int [] createArray(int size){
     int [] arr= new int [size];
     for(int i = 0; i < size; i++ ){
         arr[i]= 10; //this fills the array
     }
     return arr;
    }

    public static void main(String[] args) {
        E1 e1= new E1();
        int[] array = e1.createArray(5);
        //System.out.println(Arrays.toString(array));
        for (int i : array) {
            System.out.println(i);

        }
    }





}
