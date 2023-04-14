package ReviewClass2;

public class RCNestedLoops {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) { //outer loop controls number of complete iterations
            System.out.println(i);
            for (int j = 0; j <= 1; j++) {//inner loop always depends on outer
                System.out.println(j);
            }
        }
    }
}
