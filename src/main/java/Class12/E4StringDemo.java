package Class12;

public class E4StringDemo {
    public static void main(String[] args) {

    //using null will make concat not work
        String firstName = "Chris";
        String lastName = "Loenichen";


        String fullName= firstName+lastName;//that is why this is the most widely used approach
        System.out.println(fullName);
        //System.out.println(firstName.concat(lastName));
    }
}
