package Class12;

public class UsrPswdTask {
    public static void main(String[] args) {
        String userName ="Chris1000";
        String password ="Dogs111150";
        String confirmpassword="Dogs111150";

        if(userName.isEmpty() || password.isEmpty()){
            System.out.println("User name or password cannot be empty");
        }
        else if(password.length()<8){
            System.out.println("Password is too short");
        }
        else if(password.contains(userName)){
            System.out.println("Password cannot contain username");
        }
        else if(!password.equals(confirmpassword)){
            System.out.println("Passwords do not match");
        }
        else{
            System.out.println("Your user name and password has been created");
        }
    }
}
