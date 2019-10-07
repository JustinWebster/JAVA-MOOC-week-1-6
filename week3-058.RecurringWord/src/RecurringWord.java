
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        while(true){
            System.out.println("Type a word: ");
            String theWord = reader.nextLine();
            if(words.contains(theWord)){
                System.out.println("You typed "+theWord+" twice.");
                break;
            }else{
                words.add(theWord);
            }
        }
// create here the ArrayList 
        
    }
}
