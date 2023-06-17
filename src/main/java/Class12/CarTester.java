package Class12;

public class CarTester {
    public static void main(String[] args) {
        //below code will create an object of car class
        Car car= new Car();
        car.make="Honda";
        car.model="Fit";
        car.color="Silver";
        car.mileage=100_000;
        car.isAutomatic=true;
        car.year=2016;

        car.startCar();
        car.stopCar();
        car.turn();

        Car car1=new Car();
        car1.make="Tesla";
        car1.model="S";
        car1.color="Black";
        car1.mileage=10_000;




    }
}
