package Class11;

public class E12DArrays1 {
    public static void main(String[] args) {
        int [][] arr={{10,20,30,40,50},
        {11,22,33,44,55},
                {60,54,67,23,45},
                {78,39,21,31,34}};
        for (int row =0; row< arr.length; row++) {
            for (int column =0; column< arr.length; column++) {
                int element=arr[row][column];
                if(element%2!=0){
                    System.out.println(element);
                }
            }
        }

    }
}
