package class9;
/*
shortcuts:
1) after the array type iter and intellij will write an enhanced for loop for you
2) we can place the cursor on the for loop and click on it and it will suggest an enhanced loop
 */
public class EnhancedForLoop2 {
    public static void main(String[] args) {
        int [] numbers={45,50,20,30,-50,45};
        for (int number : numbers){
            System.out.println(number);
        }
    }
}
