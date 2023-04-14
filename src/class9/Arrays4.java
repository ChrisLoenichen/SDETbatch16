package class9;

//write a loop that starts from 0 and it goes until the number 5 and print only the even numbers
//create an array of chars and you have to print all the chars on the even indexes
public class Arrays4 {
    public static void main(String[] args) {

        char[] chars = {'A', 'B', 'C', 'D', 'E'};
        for (int j = 0; j < chars.length; j += 2) {
            //above formula is more efficient
            //for (int j = 0; j<=5; j++){
            // if (j%2==0){
            System.out.println(chars[j]);
        }
    }
}

