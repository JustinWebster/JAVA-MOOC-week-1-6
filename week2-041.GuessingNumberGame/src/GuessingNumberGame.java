
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        System.out.print("Guess a number: ");
        int guess = Integer.parseInt(reader.nextLine());
        for(int i = 1;guess > numberDrawn || guess < numberDrawn;i++){
        if(guess>numberDrawn){
            System.out.println("The number is lesser, guesses made: " +i);
            System.out.println("Guess a number: ");
            guess = Integer.parseInt(reader.nextLine());
            
        }else if(guess<numberDrawn){
            System.out.println("The number is greater, guesses made: " + i);
             System.out.println("Guess a number: ");
            guess = Integer.parseInt(reader.nextLine());
        }} 
        if(guess == numberDrawn){
            System.out.println("Congratulations, your guess is correct!");
        }

        // program your solution here. Do not touch the above lines!
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
