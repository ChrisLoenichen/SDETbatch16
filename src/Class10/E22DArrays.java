package Class10;
//you have to specify at least one of the array numbers in the [][] indexes
public class E22DArrays {
    public static void main(String[] args) {
        int[][] matrix=new int[3][3];
        matrix[0][0]=10;
        matrix[1][1]=20;
        matrix[2][2]=30;

        //System.out.println([1][3]); index out of bounds
        System.out.println(matrix[2][1]);//does not have a value se to that index, think of graph

    }

    }

