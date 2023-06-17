package Class22;

public class Methods {

public static int findAverage (int[]arr1, int num){
    int counter = 0;
    for(int average : arr1) {
        counter += average;
    }
    return counter/arr1.length;
}

    int getCount(double [] arr2,double number){
    int count = 0;
    for (double counter: arr2){
        if (arr2[count] == counter) {
            count++;
        }
        }return count;


}




    public static boolean findNumber(int [] arr, int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                return true;
            }

        }
        return false;
    }


}
