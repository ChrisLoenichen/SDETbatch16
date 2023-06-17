package Class12;
//sub print everything after the index until the last character will print
// (4,13) (beginning index, ending index)
public class E12StringDemo {
    public static void main(String[] args) {
        String sentence="yup we have another class";
        System.out.println(sentence.substring(4,11));

        int startIndex= sentence.length()-5;
        System.out.println(sentence.substring(startIndex));
    }
}
