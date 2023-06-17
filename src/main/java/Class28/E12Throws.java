package Class28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E12Throws {
    public static void main(String[] args) throws FileNotFoundException {
        print();

    }
    static void print() throws FileNotFoundException {//this is indicating that this will throw the filenotfoundexception
        FileInputStream fileInputStream = new FileInputStream("sdsds");
    }
}
