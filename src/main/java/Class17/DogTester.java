package Class17;
//this can all be done in the constructor
public class DogTester {
    public static void main(String[] args) {
        /*Dog1 dog1 = new Dog1();
        Dog1 dog2 = new Dog1();
        Dog1 dog3 = new Dog1();
        Dog1 dog4 = new Dog1();
        Dog1 dog5 = new Dog1();

        dog1.name = "Dog1";
        dog2.name = "Dog2";
        dog3.name = "Dog3";
        dog4.name = "Dog4";
        dog5.name = "Dog5";

        dog1.breed = "Breed1";
        dog2.breed = "Breed2";
        dog3.breed = "Breed3";
        dog4.breed = "Breed4";
        dog5.breed = "Breed5";

        dog1.color = "Brown";
        dog2.color = "Green";
        dog3.color = "White";
        dog4.color = "Black";
        dog5.color = "Grey";

        dog1.age = 5;
        dog2.age = 7;
        dog3.age = 6;
        dog4.age = 8;
        dog5.age = 9;

        dog1.printInfo();
        dog2.printInfo();
        dog3.printInfo();
        dog4.printInfo();
        dog5.printInfo();*/
/*
below code will create the object of the dog class
newD
 */
    Dog dog1= new Dog("Ava", "B+W","Boston",3);
    Dog dog2= new Dog("Xochi","B+W","Boston", 1);
    Dog dog3= new Dog("Bruce","Brown","Boxer",10);
    Dog dog4= new Dog("Papi","Black","Asian,",178);
    dog1.printInfo();
    dog2.printInfo();
    dog3.printInfo();
    dog4.printInfo();


    }
}
