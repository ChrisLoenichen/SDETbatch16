package Class18;
//can call 1 constructor in another one
public class Dog1 {

    String name;
    String color;
    String breed;

    int age;
    double weight;

    Dog1(String name, String color, String breed, int age, double weight){
        /*this.name=name;
        this.color=color;
        this.breed= breed;*/
        //calling the constructor from the same class which takes the below parameters
        this(name,color,breed, age);
        this.weight= weight;
    }
    Dog1(String name, String color, String breed, int age){
        this.name=name;
        this.color=color;
        this.breed= breed;
        this.age= age;
    }
    Dog1(String name, String color, String breed){
        this.name=name;
        this.color=color;
        this.breed= breed;

    }
}
