import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Random rndm = new Random();
        // Test your code here
        NightSky starTest = new NightSky(0.1,40,10);
        NightSky starburst = new NightSky(0.3,40,10);
        starTest.print();
        starburst.print();
       
       
    }
}
