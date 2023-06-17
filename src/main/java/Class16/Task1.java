package Class16;
/*
create method that will sum array
 */
public class Task1 {

  int sumArray(int[] arr1){
        int sum= 0;
        for (int element: arr1) {
            sum=sum+element;
        }
        return sum;
    }

    public static void main(String[] args) {
        Task1 task1=new Task1();
        int result = task1.sumArray(new int[]{10,10,10});
        System.out.println(result);
    }
}
