package Class22;

public class AnimalTester {

        public static void main(String[] args) {
            Animal animals[] = {new Dog("chucho", "boston","black"),
                    new Cat("chucha", "tabby","orange"),
                    new Horse("chuch", "big","brown")};
            for (Animal animales : animals) {
                animales.eat();
                animales.speak();
                animales.sleep();
                animales.printInfo();
            }



    }
}
