package Class28;

public class E5Exceptions {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("1");
        System.out.println("1");
        try{
        System.out.println(10/0);}
        catch(Exception e){
            System.out.println("something gone wrong executing back up code");
        }
        System.out.println("4");
    }
}
