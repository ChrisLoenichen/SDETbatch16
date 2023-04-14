package class9;
/*
two ways of making arrays
new int[5] create an array of int with size 5 basically defining how many before you do anything
look up how to paste under**
 */
public class Arrays8 {
    public static void main(String[] args) {
        int [] numbers= new int[5];
         //numbers[2]=50; //store 50 on index 2
         //numbers[0]=100; //store 100 on index 0
        for (int number : numbers) {
            System.out.println(number);

        }
    }
}
