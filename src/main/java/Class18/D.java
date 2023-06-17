package Class18;

public class D {
    static void print(){
        System.out.println("Hello World");
    }
}

class E extends D{

}
class Etester{
    public static void main(String[] args) {
        E.print();
    }
}
