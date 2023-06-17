package Class26;

import utils.ConfigReader;

import java.io.IOException;

public class E5ConfigReader {
    public static void main(String[] args) throws IOException {
        System.out.println(ConfigReader.getProperty("userName"));
        System.out.println(ConfigReader.getProperty("password"));
        System.out.println(ConfigReader.getProperty("URL"));
    }
}
