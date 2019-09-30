
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number:");
        int n = Integer.parseInt(reader.nextLine());
        
        int a = 0;
        
        int ans = 1;
        while(true){
           a++;
            ans *= a;
            
           
            if(a==n){
                System.out.println("Factorial is:"+ans);
                break;
            }
            
           
            
        }
        
      
}
}
// factorial of 5 5!=1*2*3*4*5 = x
