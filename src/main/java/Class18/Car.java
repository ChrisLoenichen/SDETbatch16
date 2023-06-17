package Class18;

public class Car {
    String make;
    String model;
    int engineCC;
    int year;
    String color;


    Car(String make, String model, String color){
        this.make=make;
        this.model=model;
        this.color=color;
    }

    Car(String make, String model, String color, int year){
        /*
        this(make,model,color) should be first in constructor or we will get an error
         */
        this(make, model, color);
        this.year=year;
    }
}
