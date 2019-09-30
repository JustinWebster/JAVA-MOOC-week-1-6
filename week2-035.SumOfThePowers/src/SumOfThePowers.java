
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Sum the powers of:");
        int n = Integer.parseInt(reader.nextLine());
        int x = 0;
        
        for(int help = 0;help<=n;help++){
            x = x+((int)Math.pow(2, help));
        }
        System.out.println("Sum of the powers:"+ x );
        
        }
    
    }

//*2^3 = 2x2x2