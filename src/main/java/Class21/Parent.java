package Class21;
//final keeps children class from overriding
public class Parent {

    final void getMarry(){

        System.out.println("Marry Shakira");
    }
    void study(){
        System.out.println("Study Medicine");
    }
}

class Axel extends Parent{
    @Override
    void study(){
        System.out.println("SDET");
    }
}
