package Class10;

public class E52Darrys {
    public static void main(String[] args) {
        int[][] matrix={
                {10,20,30,40,50},
                {20,50,65,20},
                {102,54,60},
                {20,55}
        };
        for(int i = 0; i< matrix.length; i++){
            //matrix[i] will return the complete 1d array at the index specified by the value of 1
            for (int j = 0; j < matrix[i].length; j++){
                //int [] arr=matrix[i]; the below code is the same in the print statement
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
