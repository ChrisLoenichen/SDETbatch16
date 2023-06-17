package Class19;

//SUPER!!!!!!!
//create 3 classes like dog cat horse define 5 properties in each class
//you can use inheritance to avoid code duplication
//and one printInfo method that wiell print the values of these variables
//create constructors as wellin each child class to initialize those
//properties create one object of each class and call the printInfo method
public class Animal{
    private String breed;
    private String name;
    private String color;
    private int weight;
    private int age;
public  Animal(String name, String color, String breed, int age, int weight){
    this.name= name;
    this.breed= breed;
    this.color=color;
    this.weight=weight;
    this.age=age;

}

    void printInfo(){
        System.out.println(breed+" "+name+" "+color+" "+weight+" "+age);
    }
}
    class Dog extends Animal{
    double price;//can add without creating a new constructor
    public Dog (String name, String color, String breed, int age, int weight, double price) {
        super(name, color, breed, age, weight);
        this.price= price;
    }

        void printInfo() {
            super.printInfo(); //reusing the printInfo method from parent class by using super
            System.out.println(price); //to add another
        }
    }

    class Cat extends Animal {
    public Cat(String name, String color, String breed, int age, int weight){
        super(name, color, breed, age, weight);
    }
    }

    class Horse extends Animal{
    public Horse(String name, String color, String breed, int age, int weight){
    super(name, color, breed, age, weight);
}

}
class AnimalTester{
    public static void main(String[] args) {


        Dog dog = new Dog("Tom", "black", "boston", 10, 50, 1000);
        dog.printInfo();
    }
}

