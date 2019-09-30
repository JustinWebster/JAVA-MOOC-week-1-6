
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sumUpTo;
        int x = 0;
        int helper = 1;
        System.out.println("Up to what number?");
        sumUpTo = Integer.parseInt(reader.nextLine());
        while (true) {
          x = x+helper;
          helper++;
            if(helper > sumUpTo){
                System.out.println("Sum is " + x);
                break;
            }
        }
        

    }
}
