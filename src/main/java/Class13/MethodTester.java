package Class13;

public class MethodTester {
    public static void main(String[] args) {
        Printer obj=new Printer();
        obj.printSomething();

        obj.printWord("Darko");
        obj.printWord("Artem Lean");

        obj.printAlot("Lean",10);
    }
}
