package YoutubeStuff;
/*
%s = strings
%d = int
*/
public class Stringmod {
    public static void main(String[] args) {
        String name = "Chris";
        String city = "Richmond";
        int num = 31;


        String formatted = String.format("Hi my name is %s, I live in %s Virginia. I'm %d years old", name, city, num);

        System.out.println(formatted);
    }
}
