package Class13;

public class E2StringDemo {
    public static void main(String[] args) {
        String str="nskeKJL12999371298LKJ!@@*(&";
        System.out.println(str.replaceAll("[a-z]", "*"));
        System.out.println(str.replaceAll("[A-Z]", "#"));
        System.out.println(str.replaceAll("[0-9]", "%"));
        System.out.println(str.replaceAll("[A-Z0-9]", "#"));
        System.out.println(str.replaceAll("[a-zA-Z0-9]", "%"));
        System.out.println(str.replaceAll("[#-Z]", "^"));

        char c='A';
        c++;
        System.out.println(c);
        for (int i= 0; i<20; i++)
        System.out.println(c++);
    }
}
