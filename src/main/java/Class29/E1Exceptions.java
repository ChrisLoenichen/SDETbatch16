package Class29;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E1Exceptions {
    //this  is the reason we have to use try catch
    public static void main(String[] args) throws FileNotFoundException {
        method1();
    }
        static void method1() throws FileNotFoundException {
            method2();
        }
        static void method2() throws FileNotFoundException {
        method3();
        }
        static void method3() throws FileNotFoundException {
            File file = new File("ExcelReader/Employees.xlsx");
            if (file.exists()){
                FileInputStream fileInputStream = new FileInputStream(file);
            }
        }
    }

