package Class20;
//cntrl O will show you everything you can override
// access level cannot be MORE restrictive the the overridden method access level
public class Parent {
    void getMarry(){
        System.out.println("Marry to the girl of our choice");
    }
    private void accessBank(){//override will not run private methods
        System.out.println("Accessing bank");
    }

    static void printNumber(){
        System.out.println(10);
    }


}
 class Axel extends Parent{
     static void printNumber(){//this will make a new method
         System.out.println(10);
     }

    @Override
     void getMarry(){// can still use all the methods from parent class but can override parent class methods if you choose to
         System.out.println("Marry thotiana");
     }

 }

 class ParentTester{
     public static void main(String[] args) {
         Axel axel = new Axel();
         axel.getMarry();
         Axel.printNumber();
     }

 }
