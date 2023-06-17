package Class26;

import utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E4ConfigFiles {
    public static void main(String[] args) throws IOException {
        // will tell you the path of where this is stored
        System.out.println(System.getProperty("user.dir"));
        //when highlighted blue it means it is the correct path
        String path =System.getProperty("user.dir")+"\\"+ "ExcelReader\\Config.properties";
        System.out.println(Constants.CONFIG_READER_PATH);
        FileInputStream fileInputStream = new FileInputStream(path);
        //That special class which knows how this file works
        Properties properties = new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("userName"));

    }
}
