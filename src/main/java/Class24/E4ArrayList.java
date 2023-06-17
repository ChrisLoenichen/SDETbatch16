package Class24;

public class E4ArrayList {
    public static void main(String[] args) {
        Integer integer = new Integer(10);//this one is boxing but is no longer the correct synatx, the one below is called auto boxing
        Integer integer1 = 10;//convert the primitives to a wrapper type this is called auto boxing, also this is being converted to an object

        int num  = integer1.intValue();//called unboxing, but not correct syntax
        int num2 = integer1; //called auto unboxing

        Integer integer2 = 10;//with wrapper classes you can assign a wrapper to a primitive data type
        int number2 = integer2;//converts a wrapper class to a primitive data type



    }
}
