package Class12;
//creating the object of dog
public class DogTester {
    public static void main(String[] args) {

        Dog actualDog= new Dog();
        actualDog.name= "Jacky";
        actualDog.age=15;
        actualDog.breed="German";
        actualDog.color="Black";
        actualDog.weight=50;

        actualDog.bark();

        Dog obj= new Dog();
        actualDog.name="Xochi";
        actualDog.age=1;
        actualDog.breed="Boston";
        actualDog.color="Black and white";
        actualDog.weight=10;

        actualDog.sleep();
    }
}
