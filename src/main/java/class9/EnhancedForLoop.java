package class9;
//cannot use this to count backwards or to check for odd. only can be used to print in the foward manner
public class EnhancedForLoop {
    public static void main(String[] args) {
        String [] confusedStudent={"Vlad","Veronica","Farwa","Halima","Lais"};
        for (String name:confusedStudent){
            System.out.println(name);
        }
    }
}
