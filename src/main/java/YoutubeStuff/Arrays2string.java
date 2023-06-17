package YoutubeStuff;

import java.util.Arrays;

public class Arrays2string {
    public static void main(String[] args) {

        //how to print array into string
        char vowels[] = new char[5];
        vowels[0] = 'a';
        vowels[1] = 'e';
        vowels[2] = 'i';
        vowels[3] = 'o';
        vowels[4] = 'u';
        System.out.println(Arrays.toString(vowels));

        char vowels2[] = {'a', 'e', 'i', 'o', 'u'};
        vowels2[3] = 'x'; //to replace in array
        System.out.println(vowels2.length);//to get array length
        System.out.println(Arrays.toString(vowels2));

        /*organize an unorganized array:
        Strings will be in alphabetical order
        For arrays of primitive types like int, double, and char, Arrays.sort()
        sorts the elements in ascending order, from lowest to highest.
        For arrays of objects like String, Integer, and Double,
        Arrays.sort() sorts the elements in their natural order, which is defined by the compareTo() method of the objects.
        */
        //to get it to sort specific arrays you need to:
        //int startingIndex= 1;
        //int endingIndex = 4;
        //Arrays.sort(vowels3,startingIndex,endingIndex);
        char vowels3[] = {'e', 'i', 'a', 'u', 'o'}; //binary search
        Arrays.sort(vowels3);
        int startingIndex = 1;
        int endingIndex = 4;
        char key = 'o';
        int foundItemIndex = Arrays.binarySearch(vowels3, startingIndex, endingIndex, key);
        System.out.println(foundItemIndex);
        System.out.println(Arrays.toString(vowels3));


    }
}
