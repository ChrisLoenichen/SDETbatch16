package Class20;
/*Method Overriding is when a sub class has the exact same method as paretn method but a
//different implementation
What are the benefits of method overriding?
1) Flexibility (if you dont like something from the parent class you can override it
2)Cleaner code
3)improved readability
Rules:
1) if we want to override a method in a child class return type,
method name and parameters should be the same.
2) private methods cannot be overridden.
3) We cant override constructors

 */
public class newAnimal {
    String breed;
    String name;
    String color;
    int age;
    int weight;

    public newAnimal(String breed, String name, String color, int age, int weight){
        this.breed =breed;
        this.name = name;
        this.color= color;
        this.age = age;
        this.weight= weight;

    }
    void sleep(){
        System.out.println("zzz");
    }

    void eat(){
        System.out.println("eating");
    }

    void speak(){
        System.out.println("speaking");
    }
    void printInfo(){
      System.out.println(breed+" "+name+" "+color+" "+weight+" "+age);
    }

 static class Dog extends newAnimal{

     public Dog(String breed, String name, String color, int age, int weight) {
         super(breed, name, color, age, weight);
     }
     @Override// when you use override you must use the same return type
     //when you override you cannot have different parameters
     void sleep(){//(int number){//when you change the parameter its treated as a new method and its overloading
         System.out.println("I love to sleep alot");
     }
 }
 static class Horse extends newAnimal{
     public Horse(String breed, String name, String color, int age, int weight) {
         super(breed, name, color, age, weight);
     }
 }

 static class Cat extends newAnimal {
     public Cat(String breed, String name, String color, int age, int weight) {
         super(breed, name, color, age, weight);
     }
 }




}

