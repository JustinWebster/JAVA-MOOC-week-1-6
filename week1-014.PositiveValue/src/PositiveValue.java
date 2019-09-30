
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number:");
        int numOne = Integer.parseInt(reader.nextLine());
        if (numOne > 0) {
            System.out.println("Your number is positive!");
        }
        if (numOne <= 0) {
            System.out.println("Your number is not positive!");
        }
        // Type your program here:
    }
}
