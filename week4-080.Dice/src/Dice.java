
import java.util.Random;

public class Dice {

    private Random random = new Random();
    private int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides +1;
        random = new Random();
        // Initialize here the number of sides
    }

    public int roll() {
      
        int x = random.nextInt(this.numberOfSides);
        if (x == 0) {
            x += 1;
        }
        // create here a random number belongig to range 1-numberOfSided
        return x;
    }
}
