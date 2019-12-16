
import java.util.Locale;





/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */

public class StringUtils {
    
    public static boolean included(String word, String searched){
       String newWord = word.toUpperCase();
        String newSearch = searched.toUpperCase().trim();
        
    
        if(newWord.contains(newSearch)){
            
        }else{
            return false;
        }
        return true;
    }
    
}
