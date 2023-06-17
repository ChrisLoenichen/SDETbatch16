package Class17;

public class Zebra {

    String name;
    String color;
    int age;
    double weight;

    public Zebra(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }
// if instance variables are not involved we can use static methods\
    void printInfo(){
        System.out.println(name+" "+color+" "+age+" "+weight);
    }
    static void speak(){
        System.out.println("moooo booo");
    }

    public static void main(String[] args) {

    }



}
