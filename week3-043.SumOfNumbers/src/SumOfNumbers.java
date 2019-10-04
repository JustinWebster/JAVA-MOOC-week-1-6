import java.util.Scanner;
public class SumOfNumbers {
    Scanner readNum = new Scanner(System.in);

    public static int sum(int number1, int number2, int number3, int number4) {
        int ans = number1 + number2+ number3+ number4;
// write your code here
        return ans;
    }

    public static void main(String[] args) {
        int answer = sum(4, 3, 6, 1);
        System.out.println("Sum: " + answer);
    }

}
