package Class18;

public class E1MultipleConstructor {
    public static void main(String[] args) {

        String str=new String("Java");
        char[] chars={'J','A','V','A'};
        String str1=new String(chars);
        //extract java and convert it to uppercase
        char[] chars2={'t','h','e','J','a','v','a'};
        String str3= new String(chars2,3,4);
        System.out.println(str3.toUpperCase());
    }


    static void method2(String name, int age){}
}
