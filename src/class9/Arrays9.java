package class9;

public class Arrays9 {
    public static void main(String[] args) {
        int [] numbers= new int[5];
        int num1=50;
        for (int i = 0; i< numbers.length;i++){
            numbers[i]=num1;
            num1=num1+10;
        }
        for (int number : numbers) {
            System.out.println(number);

        }
    }
}
