package Class7pt2;
//look up difference between while and do while
//do while will execute the code without checking at least
// once and while will check first before running
public class DoWhile {
    public static void main(String[] args) {
        int i=0;
        do{
            System.out.println(i);
            i++;
        }
        while (i>10);
    }
}
