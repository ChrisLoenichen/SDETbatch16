package ReviewClass2;
/*will not makse sense if it is not under a condition like if state
when condition is met it will reset? or go back to the beggining of the loop
 and will ignore everthing after the continue key word
 */
public class RCcontinue {
    public static void main(String[] args) {
        for(int i=1;i<=5; i++){
            if (i==3) {
                System.out.println(i);
            }
        }
    }
}
