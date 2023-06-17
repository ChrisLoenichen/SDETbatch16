package Class7;

public class WhileLoop09 {
    public static void main(String[] args) {
        int num1 = 100;
        while (num1>=1) {
            System.out.print(num1 + " ");
            num1 --;
        }
        num1=20;
        System.out.println();
        while(num1<=100){
            System.out.print(num1+" ");
            num1+=2;
        }
        num1=100;
        System.out.println();
        while(num1>=1){
            if(num1%2==1) {
                System.out.print(num1 + " ");
            }
            num1--;
        }
    }
}


