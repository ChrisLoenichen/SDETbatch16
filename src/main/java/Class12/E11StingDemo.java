package Class12;

public class E11StingDemo {
    public static void main(String[] args) {
        String name= "Today is Saturday";
        //System.out.println(name.indexOf('i'));
        //System.out.println(name.indexOf('a'));
        // start searching on index 4

        for(int i=0; i<name.length(); i++){
            if(name.charAt(i)=='a'){

                System.out.println(i);
                System.out.println();
                System.out.println(name.charAt(i));
            }
        }
        //System.out.println(name.indexOf('a',4)+name.indexOf(10));
    }
}
