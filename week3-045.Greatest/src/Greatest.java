
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
            int x = Math.max(number1, number2);
            int y = Math.max(x, number3);
        return y;
    }

    public static void main(String[] args) {
        int result = greatest(40, 80, 40);
        System.out.println("Greatest: " + result);
    }
}
