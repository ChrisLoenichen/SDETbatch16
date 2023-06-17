package Class12;

public class E2StringDemo {
    public static void main(String[] args) {
        String userName="admin";
        String password ="pass123";
        //write code to check if username and password
        //if the user name and password are less than 8  characters
        //otherwise print"usr name and pass cant be more than 8 chars
        //if (userName.length()>8 && password.length()>8):
        if(userName.length()>8){
            if(password.length()>8){
                System.out.println("Signup succ");
            }
        }else{
            System.out.println("User name and password cant be more than 8 characters");
        }
    }
}
