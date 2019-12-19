
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] tester = {8, 2, 5, 6, 4, 8};
        System.out.println("Smallest: " + smallest(tester) + " \nIndex of the smallest: " + indexOfTheSmallest(tester));
        System.out.println("Smallest from x: " + indexOfTheSmallestStartingFrom(tester, 0));
        System.out.println("");
        int[] values = {52, 20, 12, 18, 96};

        System.out.println(Arrays.toString(values));

        swap(values, 1, 0);
        System.out.println(Arrays.toString(values));

        swap(values, 0, 3);
        System.out.println(Arrays.toString(values));
        
        int[] secvals = {8, 3, 7, 9, 2, 1, 4};
        
        sort(secvals);
        
    }
    //returns the smallest value in the array
    public static int smallest(int[] array) {
        int check = array[0];

        for (int x = 0; x < array.length; x++) {
            if (check > array[x]) {
                check = array[x];

            }
        }

        return check;
    }
    //returns the index of the smallest value in the array
    public static int indexOfTheSmallest(int[] array) {

        int indicey = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest(array)) {
                indicey = i;
            }
        }

        return indicey;
    }
    // returns the index of the smallest value in the array starting from a specified index
    public static int indexOfTheSmallestStartingFrom(int[] array, int startingIndex) {
        int check = array[startingIndex];
        System.out.println(check);
        int index = startingIndex;
        for (int x = startingIndex; x < array.length; x++) {
            if (check > array[x]) {
                index = x;
                check = array[x];

            }
        }

        return index;
    }
    //swaps two elements in an array with each other
    public static void swap(int[] array, int a, int b) {
        int[] copy = array.clone();
        array[a] = copy[b];
        array[b] = copy[a];

    }
    //Sorts the int array in ascending order
    public static void sort(int[] array){
        for (int i = 0; i < array.length;i++){
            int a = indexOfTheSmallestStartingFrom(array, i);
            String n = Arrays.toString(array);
            System.out.println(n);
            swap(array, a, i);
             n = Arrays.toString(array);
            System.out.println(n);
        }
       
    }

}
