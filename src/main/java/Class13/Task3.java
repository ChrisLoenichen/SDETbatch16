package Class13;
//count the alphanumeric characters and print it

public class Task3 {
    public static void main(String[] args) {
        String rand= "ajhsAKJA1223";


        rand=rand.replaceAll("[^A-Za-z0-9]","");
        System.out.println(rand.length());
    }
}
