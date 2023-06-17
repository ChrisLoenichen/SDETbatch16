package Class13;
// ^ not operator for regular expressions
public class E3StringDemo {
    public static void main(String[] args) {

        String str = "ksnfkddlkkljjJJH213124JK&*^&*^%";
        //dont replace lower case letters from a-z and nums 0-9
        System.out.println(str.replaceAll("[^a-z0-9]",""));
        System.out.println(str.replaceAll("[Dn3]",""));
        System.out.println(str.replaceAll("[A-Z]", "\\$")); //things with special meaning can be escaped and $ will print

    }

}
