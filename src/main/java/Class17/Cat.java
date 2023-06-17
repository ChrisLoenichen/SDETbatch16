package Class17;
// must initialize local variables
public class Cat {
//default constructor below
    //not allowed to make 2 constructors that have the same data type

    String name;
    Cat(String catName) {
        name = catName;
        System.out.println("1 argument constructor");
    }
    Cat(String name,String color){}

    Cat(double weight){
        System.out.println("double argument constructor");
    }

    Cat(int age){
        System.out.println("Int argument constructor");
    }
    Cat(){
        System.out.println("0 argument constructor called");
    }

        void printInfo(){
            System.out.println(name);
    }

    public static void main(String[] args) {

        Cat cat = new Cat("lobi","brown");
        //cat.printInfo();

    }
}
