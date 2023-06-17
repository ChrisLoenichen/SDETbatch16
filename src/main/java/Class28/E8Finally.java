package Class28;

public class E8Finally {
    //finally is a block that will always be executed
    public static void main(String[] args) {

        System.out.println("1");
        try {
            System.out.println("2");
            System.out.println(10 / 0);
        }catch (Exception e){
            System.out.println("4");
            System.out.println(10/0);
        }finally {                     //why should we use the finally block?
            System.out.println("will always be executed");
        }
        System.out.println("5");
        }
    }

