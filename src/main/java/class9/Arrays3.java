package class9;

public class Arrays3 {
    public static void main(String[] args) {
        String [] names={"Tom","Tony","Mark"};
        for (int n=0;n<names.length-1;n++){
            System.out.print(names[n]+" ");
        }
        System.out.println();
        int counter=0;
        while (counter< names.length){
            System.out.print(names[counter]+ " ");
            counter++;
        }
    }
}
/*
for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println();
        int count = 0;
        while( count < names.length){
            System.out.print(names[count++] + " ");
 */