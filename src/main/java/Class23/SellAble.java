package Class23;
//all variables in interface must be capital
public interface SellAble {
    //private int PRICE = 12000; private access modifier not allowed
    //protected  int PRICE = 12000; also not allowed
    //all methods are abstract
    //final keyword not allowed because it is abstract
    //static methods not allowed because static cannot be overridden
    //interface methods cannot be private or protected because they will not be able to provide implementation
    //methods can be static
    //instance variables must be defined and capitalized


    int PRICE = 12000;

   static void sell(){
       System.out.println("Allowed");
   };
}

class Tester1{
    public static void main(String[] args) {
        SellAble.sell();
    }
}
