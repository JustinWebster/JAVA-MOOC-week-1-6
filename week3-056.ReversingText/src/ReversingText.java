
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        int i = text.length()-1;
        String help = "";
        while(i>-1){
            char reverseWord = text.charAt(i);
            
            
            help = help + reverseWord;
            i--;
        }
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        return help;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
