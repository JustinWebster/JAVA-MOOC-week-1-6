import java.util.ArrayList;

public class TheGreatest {
    public static int greatest(ArrayList<Integer> lista) {
      int i = lista.get(0);
        
      for(int y : lista){
         if(y > i){
             i = y;
         }else{
             
         } 
      }
      
     
        return i;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(-3);
        lista.add(-1);
        lista.add(-7);
        lista.add(-2);
        
        System.out.println("The greatest number is: " + greatest(lista));
    }
}
