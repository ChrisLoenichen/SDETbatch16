package ReviewClass1;
// (and) && (or) || (not) !
public class logicalOps {
    public static void main(String[] args) {

        boolean loginButtonDisplayed=true;
        boolean loginClickable=true;

        if(loginButtonDisplayed && loginClickable){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }

        System.out.println("LOGICAL OR:");

        Boolean picDisplayed=true;
        String accntName="Syntax";

        if(picDisplayed || accntName.equals("Syntax")){
            System.out.println("login was succesful");
        }else{
            System.out.println("Login not successful");
        }

        System.out.println("LOGICAL NOT!");

        Boolean hungry=!true;
        System.out.println(hungry);

        boolean cold=false;
        System.out.println(!cold);

        String str="Hello";
        if(!str.equals("Hello")){
            System.out.println("Value of string is not Hello");
        }
        boolean confirmSelected=false;
        if (!confirmSelected){
            System.out.println("Lets click on confirm checkbox");
        }
        System.out.println("Click on Pay button");


    }
}
