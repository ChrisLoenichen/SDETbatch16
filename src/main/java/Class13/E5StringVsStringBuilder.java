package Class13;
//reverse method only works in sting builder
//concept is mutability when changing is back and forth
public class E5StringVsStringBuilder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Java");
        System.out.println(str.reverse());

        //if you need a method from either strbuilder or str
        //how to convert string to string builder:
        String str1="Computer";
        StringBuilder str2=new StringBuilder(str1);
        System.out.println(str2);

        //the method below:
        str2.reverse();

        //changing it back
        str1=str2.toString();
        System.out.println(str1);


    }
}
