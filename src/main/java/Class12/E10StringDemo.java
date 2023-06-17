package Class12;

//count how many times r is in chris
public class E10StringDemo {
    public static void main(String[] args) {

        String name = "Chris";
        int count = 0;
        //System.out.println(name.charAt(1));
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'r') {
                count++;
            }
        }
        System.out.println(count);
    }
}
