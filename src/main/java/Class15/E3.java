package Class15;
//create method that takes an array as input. it addsall the numbers
//from the array and return the sum. name of the method should be
//sumArr
public class E3 {

    int sumArr(int [] arr){
    int sum= 0;

        for (int i = 0; i < arr.length; i++) {
            sum= sum+arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        E3 e3= new E3();
        int sum= e3.sumArr(new int[]{10,10,10});
        System.out.println(sum);
    }


}
