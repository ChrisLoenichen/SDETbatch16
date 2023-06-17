package Class26;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<Integer, String> companies = new LinkedHashMap<>();

        //store prices and names of the items
        companies.put(1,"Google");
        companies.put(2,"Syntax");
        companies.put(3, "Microsoft");
        companies.put(4, "Amazon");
        companies.put(5, "Target");
        companies.put(6, "Best Buy");
        companies.put(7, "Circuit city");

        System.out.println(companies.size());
        companies.replace(4,"Trader Joes");
        companies.remove(7);
        System.out.println(companies);

    }
}
