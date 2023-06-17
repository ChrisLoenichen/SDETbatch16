package class5;

import java.util.Scanner;

public class HWAge {
    public static void main(String[] args) {
        int money = 20000;
        String today = "sunday";
        if (money > 10000) {
            if (today.equals("sunday")) {
                System.out.println("go shop");
            } else {
                System.out.println("wrong day");
            }
        }else{
            System.out.println("lets save more");
        }


    }
}
