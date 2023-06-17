package Class13;
//
public class Math {
    void add(int num1, int num2){
        System.out.println(num1+num2);
    }
//defining a method
    void multi(int nums1, int nums2){
        System.out.println(nums1*nums2);
    }

    public static void main(String[] args) {
        //creating the object of Math class calling it math
        Math addi=new Math();
        //calling the method add and passing the two values
        addi.add(10,10);
        addi.multi(10,10);
    }

    }

