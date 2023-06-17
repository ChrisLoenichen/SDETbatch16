package class4;

import java.util.Scanner;
//for numbers use .nextInt
public class E8ScannerInt {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your salary");
        int salary=scanner.nextInt();
        if(salary>10000){
            System.out.println("Rich");
        }else{
            System.out.println("Do better");
        }
    }
}
