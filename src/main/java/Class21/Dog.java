package Class21;


class Animal {
    String name;
    String color;
    String breed;

    public Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    void printInfo() {
        System.out.println(name + " " + color + " " + breed);
    }

    void speak(){
        System.out.println("animals speak");
    }

    void sleep(){
        System.out.println("Animals sleep from 10 to 20 hrs");
    }

    void eat(){
        System.out.println("animals eat different things");
    }
}

class Cat extends Animal {
    public Cat(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void speak() {
        System.out.println("meow..");
    }
    @Override
    void eat(){
        System.out.println("Cats ike to eat fish");
    }
    @Override
    void sleep(){
        System.out.println("cats sleep 20 hours");
    }
}

public class Dog extends Animal {
    public Dog(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void speak() {
        System.out.println("woof..");
    }
    @Override
    void sleep(){
        System.out.println("Dogs sleep 10 hrs");
    }

    @Override
    void eat(){
        System.out.println("Dogs chew bones");
    }
    void run(){
        System.out.println("dogs fast");
    }
}

class Horse extends Animal{
    public Horse(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("neigh..");
    }
    @Override
    void sleep(){
        System.out.println("horse sleeps 10 hours");
    }
    @Override
    void eat(){
        System.out.println("Horses like carrots");
    }
}

class AnimalTester {
    public static void main(String[] args) {

        Dog dog = new Dog("shaggy", "black", "german");
        dog.printInfo();
        //parent clas variables can store the objects of the child class
        Animal dog1 = new Dog("shaggy", "black", "boston");
        dog1.printInfo();

        Animal[] animals = {new Dog("shaggy", "pink", "boston"), new Cat("Tom", "Blue", "tabby")};

        for (Animal animal : animals) {
            animal.printInfo();
        }
        //type casting(widening)
        double d = 10;
        Animal dog2 = new Dog("shaggy", "black", "boston");

        //int g = (int)10.5;
        //Dog dog3 = new Animal(""")// narrowing not allowed usually
    }
}
