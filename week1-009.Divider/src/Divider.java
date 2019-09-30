
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
    System.out.println("Welcome to the Divider! Enter the first number:");
            int numOne = Integer.parseInt(reader.nextLine());
            System.out.println("Enter the second number:");
            int numTwo = Integer.parseInt(reader.nextLine());
            double answer = (numOne*1.0)/numTwo;
            System.out.println("Division:"+numOne +" / "+numTwo+" = "+ answer);
        // Implement your program here. Remember to ask the input from user.
    }
}
