package class9;
//when you create an int variable and put a number and use that in print
//it will print out the index number of the array
public class ArraysPrint {
    public static void main(String[] args) {

        double [] numbers={10.5,5.5,0.05,100.5,586,78};
        //numbers.length gives us total count of elements in array
        //it literally calls the number of the elements in the array
        System.out.println(numbers.length);
        for (int j=0;j< numbers.length;j++){
            System.out.print(numbers[j]+" ");
        }





    }
}
