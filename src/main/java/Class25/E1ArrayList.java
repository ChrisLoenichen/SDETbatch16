package Class25;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {
        //a framework is a prewritten code that allows developers to build applications more easily and quickly
    //arraylist is a class and it is a part of the collections framework
        // <> "diamond operator or angle brackets" we put the name of the class whose object we are storing

        //creating th eobject of the car class, storing it into the variable in car1
        Car car1 = new Car("Toyota","Camry");
        Car car2 = new Car("Honda","Civic");
        Car car3 = new Car("BMW","I7");

        ArrayList<Car> arrayList = new ArrayList<>();
        //dogs.add(new Dog());//creating object of the dog class and storing it in arrayList
        arrayList.add(car1);
        arrayList.add(car2);
        arrayList.add(car3);
        //adding objects to the array list below
        for(Car c :arrayList){
            c.printInfo();

        }
    }
}

class Car{
    String make;
    String model;
    Car(String make, String model){
        this.make= make;
        this.model= model;
    }
    void printInfo(){
        System.out.println(make+" "+model);
    }
}