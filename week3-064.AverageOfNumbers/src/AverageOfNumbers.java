
import java.util.ArrayList;

public class AverageOfNumbers {

    // Copy here the method sum from previous assignment
    public static int arrayLength(ArrayList<Integer> list){
        int i = 0;
        for(int p : list){
            i++;
        }
        return i;
    }
    public static int sum(ArrayList<Integer> list) {
        int a = 0;
        int i = 0;
        for(int p : list){
        
           a += list.get(i);
           i++;
        }
        
        return a;
    }
    

    public static double average(ArrayList<Integer> list) {
        double av = (sum(list)*1.0)/(arrayLength(list)*1.0);
        return av;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}
