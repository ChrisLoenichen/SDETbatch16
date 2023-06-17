package Class23;

public class MOveAbleTester {
    public static void main(String[] args) {
        MoveAble moveAble= new Cat();
        washAble washAble = new Dog();
        MoveAble[] moveAbles={new Cat(), new Dog()};

        for (MoveAble m : moveAbles){
            m.move();
        }
    }
}
