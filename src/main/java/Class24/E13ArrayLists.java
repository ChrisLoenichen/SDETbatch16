package Class24;

import java.util.ArrayList;
//create an arrayList of even numbers from 1 to 500. remove any number that is divisible by 5 from that array list
public class E13ArrayLists {
    public static void main(String[] args) {
        /*
        ArrayList<Integer> numbers= new ArrayList<>();

        //create Arraylist of even numbers from 1 to 500
        for (int i = 2; i <=500 ; i+=2) {
            numbers.add(i);
        }
        //remove numbers divisible by 5
        numbers.removeIf(n -> n %5 ==0);

        //print the resulting array list
        for (int number : numbers) {
            System.out.print(number+" ");
        }*/
//better way:

        ArrayList<Integer> number1 = new ArrayList<>();
        for (int i = 2; i <500 ; i=i+2) {
            number1.add(i);
        }
        System.out.println(number1);
        number1.removeIf(x->x%5==0);
        System.out.println(number1);


    }
}
