package Class24;
//what ever data type you put into the <> brackets will change all of the methods to that data type in that class
//we can only pass a class in <>
//for each primitive data type there is a class you can use instead
//THESE ARE CALLED WRAPPER CLASSES
import java.util.ArrayList;

public class E1ArrayList {
    /* Different wrappers!
    byte=> Byte
    short => Short
    int=> Integer
    long=>Long
    float => Float
    double => Double
    boolean => Boolean
    char => Character
     */
    public static void main(String[] args) {
        ArrayList<String> arrayList= new ArrayList();

       Integer integer = new Integer(10);
       Integer integer1 = 20;//this syntax is also acceptable with these special classes
        String str = "no";
        System.out.println(Integer.MAX_VALUE);
        int num= 10;


        System.out.println(integer1*integer);



    }
}
