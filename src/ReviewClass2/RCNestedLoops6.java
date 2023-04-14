package ReviewClass2;
//continue will reset the nested loop on the next loop
public class RCNestedLoops6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                if (i == 2) {
                    continue;
                }
                System.out.println("Hello");
            }
            System.out.println("Bye");
        }
    }
}
