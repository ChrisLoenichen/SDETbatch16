package Class29;

import java.io.FileNotFoundException;

public class E2Exceptions {
    //this  is the reason we have to use try catch
    public static void main(String[] args) throws FileNotFoundException {
        try{
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println("please dont divide any number by zero");
        }
        }
    }

