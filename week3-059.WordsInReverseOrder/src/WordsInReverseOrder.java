import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
          ArrayList<String> words = new ArrayList<String>();
        String wordCollecter;
        while(true){
            
        System.out.print("Type a word: ");
        wordCollecter = reader.nextLine();
        if(wordCollecter.isEmpty()){
            Collections.reverse(words);
            for(String printerOfWords : words){
                System.out.println(printerOfWords);
            }break;
        }else{
            words.add(wordCollecter);
        }
        }
        // create here an ArrayList
    }
}
