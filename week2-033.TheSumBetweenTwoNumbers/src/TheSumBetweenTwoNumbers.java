
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First:");
        int first = Integer.parseInt(reader.nextLine());
        System.out.print("Second:");
        int second = Integer.parseInt(reader.nextLine());
      int y = 0;
      int x = 0;
      while(true){
          x++;
          
          if(x >= first){
          y += x;
             if(x == second){
                 
                  System.out.println(y);
                  break;
                  }
      }
                
            }
                
                
        }
}
        
   
