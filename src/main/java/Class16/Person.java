package Class16;
//private will only work in the same class
public class Person {

    public String name="Vlad";

    private String password;

    private static double bankBalance=12000;

    private void printPassword(){
        System.out.println(password);
    }
    private  static void printBalance(){
        System.out.println(bankBalance);
    }

    public static void main(String[] args) {
        Person chris= new Person();
        chris.password="12345";
        chris.printPassword();
        System.out.println(Person.bankBalance);
    }
}
