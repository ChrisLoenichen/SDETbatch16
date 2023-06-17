package Class12;

public class Car {

    String model;

    String make;

    String color;

    int mileage;

    boolean isAutomatic;

    int year;

    void startCar(){
        System.out.println("Starting the "+make);
    }
    void stopCar(){
        System.out.println("Applying breaks tp stop the car");
    }
    void turn(){
        System.out.println("Turning..");
    }
}
