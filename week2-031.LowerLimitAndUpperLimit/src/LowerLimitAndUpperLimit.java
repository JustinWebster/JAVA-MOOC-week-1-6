
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First num:");
        int firstNum = Integer.parseInt(reader.nextLine());
        System.out.print("Second num:");
        int secondNum = Integer.parseInt(reader.nextLine());
        int x = firstNum;

        while (true) {
            if (x > secondNum) {
                break;
            }
            if (x >= firstNum && x <= secondNum) {
                System.out.println(x);

            }
            x++;
        }
        // write your code here

    }
}
