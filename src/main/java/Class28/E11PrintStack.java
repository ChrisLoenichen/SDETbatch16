package Class28;

public class E11PrintStack {
    //stack trace helps you trace the error you are facing

    public static void main(String[] args) {

        try{
            System.out.println(10/0);
        }catch (ArithmeticException e){
            e.printStackTrace();
            //System.out.println(e.getMessage());
            //System.out.println(e);
        }
        System.out.println("1");
    }
}
