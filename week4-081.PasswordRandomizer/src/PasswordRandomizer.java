import java.util.Random;

public class PasswordRandomizer {
    // The variables
        private Random random = new Random();
        private int passLength;
        private String pass;
        private char symb;
        
    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.pass = "";
        this.passLength = length;
        this.random = new Random();
        
    }

    public String createPassword() {
        // Code that returns a randomized password containing characters between a - z
        
        this.pass = "";
        for(int i = 1; i < this.passLength+1; i++){
            
        this.symb = "abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(26));
         
       this.pass = pass + this.symb;
        }
        return pass;
    }
}
