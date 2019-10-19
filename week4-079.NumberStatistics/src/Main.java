
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        NumberStatistics count = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        Scanner reader = new Scanner(System.in);

        int i = 0;

        while (i < -1 || i >= 0) {
            System.out.println("Type numbers:");
            i = Integer.parseInt(reader.nextLine());

            if (i != -1) {
                count.addNumber(i);
                if (i % 2 == 0) {
                    even.addNumber(i);
                } else {
                    odd.addNumber(i);

                }
            } else if (i == -1) {
                
                System.out.println("Sum: " + count.sum());
                System.out.println("Sum of even: " + even.sum());
                System.out.println("Sum of odd:" + odd.sum());
                
                break;
            }

        }

    }

}
