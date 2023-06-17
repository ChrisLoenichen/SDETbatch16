package Class11;

public class E122DArray {
    public static void main(String[] args) {
        String [][] names2Darray={{"Sarah","Arten","Lean","Semir"},
                {"Farwa","Halima","Alina","Semir"}};
        for (String[]name1DArr:names2Darray){
            for(String name: name1DArr){
                System.out.println(name);
            }
        }

    }
}
