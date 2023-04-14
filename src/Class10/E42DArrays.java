package Class10;

public class E42DArrays {
    public static void main(String[] args) {
        int[][] matrix={
                {10,20,30},
                {20,50,65},
                {102,54,60}
        };
        for (int j =0; j< matrix.length; j++) {
            //getting the complete oneD array from 2D array
            int [] arr2=matrix[j];
            for (int i = 0; i< arr2.length; i++){
                //going over the elements in the oneD array
                System.out.print(arr2[i]+" ");
            }
            //to print all rows on new line
            System.out.println();
        }
    }
}
