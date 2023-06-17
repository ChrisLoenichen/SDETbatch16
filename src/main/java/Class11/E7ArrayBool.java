package Class11;

public class E7ArrayBool {
    public static void main(String[] args) {
        boolean [][] arr2d= {
                {true,false,true,true, false},
                {true,false,false,false,false},
        };
        int counter=0;
        for (boolean[]ar1D: arr2d)
        {for(boolean booll : ar1D){
         if(booll){
             counter++;
         }
        }
        }   }
}
