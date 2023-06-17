package Class13;

public class ArrayUtil {
    public static void main(String[] args) {
        int[]arr={10,20,45,89};
        int[]arr1={12,32,455,889};
        int[]arr2={112,322,4255,8829};

        int number=89;
        int number1=455;
        int number2=322;

        ArrayUtil chris= new ArrayUtil();
        chris.searchArr(arr,number);
        chris.searchArr(arr1,number1);
        chris.searchArr(arr2,number2);


    }
    void searchArr(int []arr, int number){
        for (int i =0; i<arr.length;i++){
            if(arr[i]==number){
                System.out.println("yes");
                break;
            }
        }

    }
}
