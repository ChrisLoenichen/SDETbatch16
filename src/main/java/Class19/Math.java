package Class19;
//methods with same name and different parameters are called method overloading
/*
allows a class to define multiple methods with the same name , but different signatures
How to have different signatures?
1) by changing the number of parameters that a method takes
2)by changing the data types of the parameters
3) by changing the sequence of parameters
the ONLY 3 ways you can overload a method

Why should we overload a method?
1) cleanliness
2) increases readability of the program
3) we dont have to remember alot fo method names if we are performing the same operation
4) it allows us to achieve polymorphism

 */
public class Math {

    static void add(int num1, int num2){//<==method header, name of the method + its parameters is called the signature of the method
        System.out.println(num1+num2);//<==body of the method
    }
    static void add(int num1, double num2){
        System.out.println(num1+num2);
    }
    static void add(double num2, int num1){
        System.out.println(num1+num2);
    }
    static void add(double num1, double num2){
        System.out.println(num1+num2);
    }


    static void add(long num1, long num2){
        System.out.println(num1+num2);
    }
    static void add(double num1, double num2, int num3){ //changing the number of parameters
        System.out.println(num1+num2+num3);
    }
    //we must have different 1)number of parameters 2)data types of parameters 3) sequence of dataTypes


    public static void main(String[] args) {
        add(10,10);
        add(10,20.5);
        add(2.5,2.5);
        add(52226,55555556);
        add(1.2,6);
    }
}
