package Class24;

import java.util.ArrayList;
import java.util.List;
//all elements in linked list are sort of random, best to use for adding things to a list
public class E16LinkedList {
    public static void main(String[] args) {
        List<Integer> names = new ArrayList<>();
        names.add(10);//0
        names.add(20);//1
        names.add(44);//2
        names.add(50);//3
        names.add(100);//4
        System.out.println(names);//will shift and inserted at index 1
        names.add(1,500);//specifies the index in which you want to add the element, and the value of the element
        names.remove(2);
        System.out.println(names);//this is okay for shorter arrays but not for tons of elements but it will be super slow

         }
}
