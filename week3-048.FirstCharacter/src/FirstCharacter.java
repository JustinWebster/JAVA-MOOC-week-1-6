import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String theirName = getName(reader);
        System.out.println("First Character: "+firstCharacter(theirName));
    
    
    
    }


    public static String getName(Scanner reader){
        
        String name = reader.nextLine();
                return name;
    }

public static char firstCharacter(String theirName){
    char firstLetter = theirName.charAt(0);
    return firstLetter;
}

}
