package class9;
/*
create an array and store 10,50,60,45,100 then print elements that are present on odd indexes
expected out is 50 45
 */
public class Arrays6 {
    public static void main(String[] args) {
        int [] i={10,50,60,45,100};
        for (int j = 0; j < i.length; j++) {
            if(j%2!=0){
            System.out.println(i[j]);}
        }
    }
}
