import java.util.ArrayList;

public class Variance {
      public static int arrayLength(ArrayList<Integer> list){
        int i = 0;
        for(int p : list){
            i++;
        }
        return i;
    }
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int a = 0;
        int i = 0;
        for(int p : list){
        
           a += list.get(i);
           i++;
        }
        
        return a;
    }
    
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double av = (sum(list)*1.0)/(arrayLength(list)*1.0);
        return av;
        
    }

    public static double variance(ArrayList<Integer> list) {
        double vary =0.0;
        double n = average(list);
        for(int var : list){
            double va =var - n;
           
           
            va = Math.pow(va, 2);
            
            vary+=va;
           
        }
                
         double actualVariance = vary/(arrayLength(list)-1);
         return actualVariance;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        
        System.out.println("The variance is: " + variance(list));
    }

}
