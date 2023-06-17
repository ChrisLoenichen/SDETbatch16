package class9;
//use modules by 3 4 7 for odd?? look up more modulus to understand it better
//if we are determining for even numbers, we use: number%2==0 and if we want odd, we want to use: number%2==1
public class modulusHelpNote {
    public static void main(String[] args) {
        for(int i =1;i<=50;i++)
            if(i%3!=0){
            System.out.println(i+"");
        }
    }
}
