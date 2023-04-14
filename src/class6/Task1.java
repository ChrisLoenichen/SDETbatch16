package class6;

import java.util.Scanner;

//prompt the user to entrer hight in inches
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your height inch");
        int height = scanner.nextInt();
        if (height < 60){
        System.out.println("Short");
        } else if(height>=60 && height<72){
            System.out.println("Medium");
        }else{}
    }
}
