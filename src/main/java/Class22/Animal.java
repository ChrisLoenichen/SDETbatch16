package Class22;

/*
create 3 animals and define 3 common methods in each class
Abstract!
class and methods can also be abstract
methods must be empty
all other methods should also have the abstract methods in the child classes
you can also make the child classes abstract
you cannot create the object of an abstract class
 */
public abstract class Animal {

    private String name;
    final private String breed;
    private String color;

    public Animal(String name, String breed, String color) {
        this.name = name;
        this.breed = breed;
        this.color = color;
    }

    abstract void speak();
    abstract void eat();
    abstract void sleep();

    void printInfo(){
        System.out.println(breed+" "+name+" "+color);
    }

}
class Dog extends Animal {

    public Dog(String name, String breed, String color) {
        super(name, breed, color);
    }

    @Override
    void speak(){
        System.out.println("woof");
    }
    @Override
    void eat(){
        System.out.println("eats bones");
    }
    @Override
    void sleep(){
        System.out.println("snores like grown ass man");
    }
}
class Cat extends Animal{

    public Cat(String name, String breed, String color) {
        super(name, breed, color);
    }

    @Override
    void speak(){
        System.out.println("puurrr");
    }
    @Override
    void eat(){
        System.out.println("loves fish");
    }
    @Override
    void sleep(){
        System.out.println("zzz..purrrr");
    }
}
class Horse extends Animal{

    public Horse(String name, String breed, String color) {
        super(name, breed, color);
    }

    @Override
    void speak(){
        System.out.println("neigh");
    }
    @Override
    void eat(){
        System.out.println("eats hay");
    }
    @Override
    void sleep(){
        System.out.println("cursed to sleep standing up");
    }


}
