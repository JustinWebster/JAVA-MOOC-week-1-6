import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
     System.out.println("Type your name: ");
        String theirName = getName(reader);
        System.out.println("Last Character: "+lastCharacter(theirName));
    
    }
    
    
       public static String getName(Scanner reader){
        
        String name = reader.nextLine();
                return name;
    }

public static char lastCharacter(String theirName){
    char lastLetter = theirName.charAt(theirName.length()-1);
    return lastLetter;
}
}
