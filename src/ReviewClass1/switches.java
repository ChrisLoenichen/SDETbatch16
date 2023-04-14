package ReviewClass1;

//conditional statements 1. if states 2. switch statements
// if works with conditions, switch works with values in the form of cases
// cases have to be the same data type as the variable great alternative to if else states
//.toLowerCase() will make everything lowercase
public class switches {
    public static void main(String[] args) {
        String color = "RED";

        switch (color.toLowerCase()) {
            case "red":
                System.out.println("Stop");
                break;
            case "orange":
                System.out.println("Yield");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Unknown");
        }


    }
}