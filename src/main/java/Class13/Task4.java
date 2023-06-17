package Class13;
/*
You have a String a=”Is it saturday?
 Is it raining? Do we have a Java Class today?”
 How would you find out how many sentences are in that String?
 */
public class Task4 {
    public static void main(String[] args) {
        String sent="We are in park. Start to drive. Go fast";
        String [] arrSent=sent.split("[.!?]");
        System.out.println(arrSent.length);

    }
}
