package Class21;

public class Refresher {
    public static void main(String[] args) {

        /*int [] arr1={10,20,30};
        for(int num : arr1){
            System.out.println(num);
        }

        String [] names={new String("vlad"),"Marina", "veronica"};
        for(String name : names){
            System.out.println(name.length());
        }*/
        //creating an array of dogs, storing the objects of the dog class

        Dog [] dogs = {new Dog("papi", "negro", "boston"),new Dog("chucho","black","boston")};
        //getting the first object that is on index 0 from the array and putting it into a variable
        //Dog d = dogs [0];
        //d.printInfo();
        /*
        for (int i = 0; i < dogs.length; i++) {
            dogs[i].printInfo();
        //calling all the methods with above code
        }
           */
        for (Dog d: dogs ){
            d.printInfo();
        }

    }
}
