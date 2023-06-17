package Class20;
//remember if the class is static you have to add the class name before
public class newAnimalTester {
    public static void main(String[] args) {
        newAnimal.Dog dog = new newAnimal.Dog("boston","ava","b+w",3, 24);
        newAnimal.Cat cat= new newAnimal.Cat("tabby","sasuke","black",3, 10);
        newAnimal.Horse horse= new newAnimal.Horse("dunno","studly", "shit brown",38,790);

        dog.sleep();
        /*dog.eat();
        dog.sleep();
        dog.speak();
        dog.printInfo();*/

    }
}
