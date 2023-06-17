package Class17;
//when using this. it referres to the instance variable
public class Food {
    String name="Pasta";

    void printFood(){//local variables are preferred by java
        String name= "Burgers";
        System.out.println(name);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        Food food = new Food();
        food.printFood();
    }
}
