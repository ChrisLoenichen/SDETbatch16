package Class18;
//multiple level inheritance
public class Person {
    String name;
    void sleep(){
        System.out.println("zzz");
    }
}
 class Employee extends Person{

 }

class Tester extends Employee{}

class PersonTester{
    public static void main(String[] args) {
        Employee employee= new Employee();
        employee.sleep();
        Tester tester=new Tester();
        tester.name="Chris";

        System.out.println(tester.name);
    }

}
