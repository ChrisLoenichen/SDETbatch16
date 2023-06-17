package Class17;

public class Car {
    String make;
    String model;
    int engineCC;
    String color;

    /*Car(String carMake, String carModel,int EngineCC, String Color ){
        make=carMake;
        model= carModel;
        engineCC=EngineCC;
        color=Color;

    }*/
    Car(String make, String model,int engineCC, String color ){
        this.make=make;
        this.model= model;
        this.engineCC=engineCC;
        this.color=color;
    }
    void printInfo(){
        System.out.println(make+" "+model+" "+engineCC+" "+color);
    }

    public static void main(String[] args) {
        Car car=new Car("Honda","Civic", 1800, "black");
        car.printInfo();
    }
}
