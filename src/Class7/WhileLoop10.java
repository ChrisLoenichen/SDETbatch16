package Class7;

public class WhileLoop10 {
    public static void main(String[] args) {
        int num1 = 1;
        int sum = 0;
        while (num1 <= 10) {
            sum = sum + num1;
            num1++;
        }

        System.out.print(sum);
    }
}