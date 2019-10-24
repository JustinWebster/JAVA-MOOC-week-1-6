
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;
    private Random randomNums;
    private int length;
    private int r;

    public LotteryNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();

    }

    public ArrayList<Integer> numbers() {

        return this.numbers;
    }

    public void drawNumbers() {
        this.randomNums = new Random();
        this.numbers = new ArrayList<Integer>();
        while (this.numbers.size() < 7) {
            this.r = this.randomNums.nextInt(39) + 1;
            if (!this.containsNumber(this.r)) {
                this.numbers.add(this.r);
                
            }
        }

    }
    // Write the number drawing here using the method containsNumber()

    public boolean containsNumber(int number) {
        if (this.numbers.contains(number)) {
            return true;
        }
        return false;
    }

}
