package Class14;
/*
create a method that will take an int array call it a sumArr
and return the sum of all the elements in the array
create the object of the class and call the method

return type int
name of the method=> sumArr
parameters=> (int [] arr)
body=>
{
go through all the elements of the array add them and return the results
}
 */

import java.util.Scanner;

public class ArrayManipulator {
    int sumArr(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayManipulator obj= new ArrayManipulator();
        int[] array={10,20,30};
        int result=obj.sumArr(array);
        Scanner scanner=new Scanner(System.in);
        int age= scanner.nextInt();
    }
    }


