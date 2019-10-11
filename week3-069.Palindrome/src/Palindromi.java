
import java.util.Scanner;

public class Palindromi {

    public static String reverse(String text) {
        int i = text.length() - 1;
        String reversedWord = "";
        while (i > -1) {
            char reverseWord = text.charAt(i);
            reversedWord = reversedWord + reverseWord;
            i--;
        }
        return reversedWord;
    }

    public static boolean palindrome(String text) {
        // write code here
        String palindromeTest = reverse(text);
        
        while(palindromeTest.equals(text)){
            return true;
        }
        
            return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
