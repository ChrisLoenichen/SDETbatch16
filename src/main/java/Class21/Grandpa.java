package Class21;

public class Grandpa {
    double money;

}

class Father extends Grandpa{

}

class Child extends Father{
    void printMoney(){
        System.out.println(money);
    }
}