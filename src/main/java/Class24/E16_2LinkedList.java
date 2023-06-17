package Class24;

import java.util.LinkedList;
import java.util.List;

public class E16_2LinkedList {
    public static void main(String[] args) {
        //38686 time for the Array list to load when adding elements to the array list
        //112 for the linked list
        //but when it comes to retrieving the data an array list is way faster than a linked list
        long start  = System.currentTimeMillis();//to track how long the operation takes
        List<Integer> numbers = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            numbers.add(0,i);

        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}//how to decide when to use array list of link list
//ArrayList: if in code 80% of the times you use get method 20% add(index, element), remove\
//LinkedList: if 70 to 80 of the times you use the remove method or adding the data inbetween you should use the link list
