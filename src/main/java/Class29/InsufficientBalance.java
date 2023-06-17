package Class29;
//names if the class will become the exception
//this exception is thrown when there is not enough money in users account and goes over
public class InsufficientBalance extends RuntimeException {
    public InsufficientBalance(String errorMessage){
        super(errorMessage);
    }
}
