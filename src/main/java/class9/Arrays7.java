package class9;

public class Arrays7 {
    //print all the numbers from 6 to 0 in reverse order
    public static void main(String[] args) {
        char[] chars1= {'A','B','C','D','E','F'};
        //use chars.length-1 instead of 5 for same output so that we dont get index out of bounds
        for(int i = 5; i>=0; i--){
            System.out.println(i);
        }
    }
}
