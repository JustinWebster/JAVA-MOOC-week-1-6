
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your name: ");
         String theName = getName(reader);
         System.out.println("Number of characters: "+ calculateCharacters(theName));
            
// call your method from here
    }
    
    public static String getName(Scanner reader){
        String name = reader.nextLine();
                return name;
    }
    
    public static int calculateCharacters(String theName){
        int length = theName.length();
        return length;
    }
    // do here the metshod
    // public static int calculateCharacters(String text)
    
}
