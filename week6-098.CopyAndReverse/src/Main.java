

public class Main {

   public static void main(String[] args) {
    int[] original = {1, 2, 3, 4};
    int[] copied = copy(original);
    int[] cloner =reverseCopy(original);
    // change the copied
    copied[0] = 99;

    // print both
       
       
}
    
    public static int[] copy(int[] array){
        int size = array.length;
        int[] clone = new int[size];
       System.arraycopy(array, 0, clone, 0, size);
        
        
        return clone;
    }
    public static int[] reverseCopy(int[] array){
        int sizeTwo = array.length;
        int ct = sizeTwo;
        int[] nwClone = new int[sizeTwo];
        for(int p : array){
            nwClone[ct-1] = p;
            ct--;
        }
     
        
      return nwClone;
        
    }
   
    
}
