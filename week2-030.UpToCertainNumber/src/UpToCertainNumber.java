
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int x = 1;
        int y;
        System.out.print("Up to what number?");
        y = Integer.parseInt(reader.nextLine());
        while(x < (y+1)){
            System.out.println(x);
            x++;
        }
        // Write your code here
        
    }
}
