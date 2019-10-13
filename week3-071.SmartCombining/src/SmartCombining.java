import java.util.ArrayList;
import java.util.Collections;

public class SmartCombining {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Collections.addAll(list1, 5, 1, 2);

        Collections.addAll(list2, 5, 1, 2, 1, 7);

        // remove comment when method ready
        smartCombine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);
    }
public static void smartCombine(ArrayList<Integer> first, ArrayList<Integer> second){
   
    for(int i : second){
       
    if(first.contains(i)){
    
  }else{
      first.add(i);
  }
   
}
}
}
