
public class AverageOfGivenNumbers {
    
    // implement here again the method of exercise 43
    public static int sum(int number1, int number2, int number3, int number4) {
        int ans = number1 + number2+ number3+ number4;

        return ans;
        
    }

    public static double average(int number1, int number2, int number3, int number4) {
        double x = AverageOfGivenNumbers.sum(number1, number2, number3, number4)*1.0/4;
        return x;
    }

    public static void main(String[] args) {
        double result = average(1,2,3,4);
        System.out.println("Average: " + result);
    }
}
