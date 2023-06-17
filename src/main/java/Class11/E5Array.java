package Class11;

public class E5Array {
    public static void main(String[] args) {
        int[][] arr2D = {{10, 20, 30, 40, 50},
                {11, 22, 33, 44, 55},
                {60, 54, 67, 23, 45},
                {78, 39, 21, 31, 34}};
        int counter = 0;
        for (int[] arr1D : arr2D) {
            for (int num : arr1D) {

                if (num % 2 == 0) {
                    counter++;
                }

            }
        }
        System.out.println("counter = " + counter);
    }
}
