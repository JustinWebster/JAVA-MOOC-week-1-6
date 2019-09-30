
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
            System.out.println("Welcome to the adder! Enter the first number:");
            int numOne = Integer.parseInt(reader.nextLine());
            System.out.println("Enter the second number:");
            int numTwo = Integer.parseInt(reader.nextLine());
            int answer = numOne+numTwo;
            System.out.println("Sum of the numbers:"+numOne +" + "+numTwo+" = "+ answer);
        // Implement your program here. Remember to ask the input from user
    }
}
