package Class23;
/*
In interfaces by default everything is public static final, no instance variables must define
also by default are abstract methods
allows us to have multiple inheritance, polymorphism, abstraction
 */
public interface MoveAble {
    int age = 12;

    void move();
}

interface washAble{
    void wash();
}

class Dog implements MoveAble, washAble{

    @Override
    public void wash() {
        System.out.println("wash me");
    }

    public void move(){
        System.out.println("Moving...");
    }
}
class Cat implements MoveAble{
    @Override
    public void move() {
        System.out.println("Cats can also move");
    }
}
class Horse{
    public void move(){
        System.out.println("Horses can also move");
    }
}
