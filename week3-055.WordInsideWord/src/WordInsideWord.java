
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first word: ");
        String word = reader.nextLine();
        System.out.println("Type the second word: ");
        String searchFor = reader.nextLine();
        
        if(word.contains(searchFor)){
        System.out.println("The word '"+searchFor+"' is found in the word '"+word+"'");
        }else {
            System.out.println("The word '"+searchFor+"' is not found in the word '"+word+"'");
        }
    }
}
