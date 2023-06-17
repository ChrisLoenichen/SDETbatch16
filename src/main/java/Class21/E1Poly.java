package Class21;
//creating an array out of objects
public class E1Poly {
    public static void main(String[] args) {

        Animal [] animals= {new Dog("tony","black","boston"),
                new Cat("tommy","orange","tabby"),
                new Horse("Timmy","orange","big")
        };
        for (Animal animal: animals) {
            animal.sleep();
            animal.speak();
            animal.eat();

        }
        Animal animal=  new Dog("Xochi","black", "boston");
        //we must type cast the animal back to a dog to call the run method
        //as this run method only exists in dog class
       Dog d= (Dog)animal;
       d.run();
       //direct way without using a variable

        ((Dog) animal).run();

        int num =(int)10.5;

    }

}
