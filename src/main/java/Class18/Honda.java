package Class18;

public class Honda extends Carro {

}

class BMW extends Carro{
void offerMPackage(){
    System.out.println("Only BMW offers the M package");
}
}
class Audi extends Carro{

}
class CarTester{
    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.stopCar();
    }
}
