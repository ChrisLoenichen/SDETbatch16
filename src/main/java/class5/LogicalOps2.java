package class5;

public class LogicalOps2 {
    public static void main(String[] args) {

        //System.out.println(true ||true||false);
        int age=17;
        if(age<18 || age>60){ //long as one is true it will execute the prog
            System.out.println("discount");
        }
        char gender='F';
        if(gender=='F' || age>60){
            System.out.println("discount");
        }

    }
}
