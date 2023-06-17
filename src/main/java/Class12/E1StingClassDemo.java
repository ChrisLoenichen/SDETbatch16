package Class12;

public class E1StingClassDemo {
    public static void main(String[] args) {
        //String class is most used class
        //create the object of that class
        // Scanner scan= new Scanner(System.in) example
        //ClassName objectName = new ClassName()
        //String s = new String("Chris");
        String string1="Chris";//same as above but a shortcut
        System.out.println(string1.length());// comes out to 5 because there are 5 characters(chars)

        String name="Christopher Loenichen";
        if(name.length()>8){//will print if true
            System.out.println("Only 8 characters are allowed");
        }

    }
}
