
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> wordStorage = new ArrayList<String>();
        while(true){
            System.out.println("Type a word: ");
            String getWord = reader.nextLine();
            if(getWord.isEmpty()){
                Collections.sort(wordStorage);
                for(String wordPrinter : wordStorage){
                    System.out.println(wordPrinter);
                }
            break;
            }else{
                wordStorage.add(getWord);
            }
        }
    }
}
