package Class26;

import java.util.TreeMap;

public class Countries {
    public static void main(String[] args) {
        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("USA","Springfield");
        countries.put("Mexico","Mexico City");
        countries.put("Canada","Ontario");
        countries.put("Costarica","Tamarindo");
        countries.put("Ecuador","Quito");

        //Set<String>countrySet = countries.keySet();
        for(String c : countries.keySet()){
            System.out.println(c);
        }

        System.out.println("*********");

        for(String v : countries.values()){
            System.out.println(v);
        }

        System.out.println("*********");
        //Var keyword is used here instead of typing Map.Entry<String,String>
        for(var e : countries.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
            System.out.println(e);
        }





    }
}
