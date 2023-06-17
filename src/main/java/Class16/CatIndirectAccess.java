package Class16;
//fields are almost always private demo, if you want to share private information this is how
public class CatIndirectAccess {
    private String name;
    private String breed;
    private String color;
    //indirect access, create a method that is not private
    public void printInfo(String password){
        if(password.equals("pass123")) {
            System.out.println(name);
        }else{
            System.out.println("provide correct password");
        }
    }

}
