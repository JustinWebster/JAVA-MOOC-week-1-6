import java.util.Scanner;
//I know this can be done much easier with int y = 0; while(y<3) print theirName.charAt(i); i++ they said they wanted methods!!! >:(
public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String theirName = getName(reader);
        int x = 0;
        int count = 1;
       for(int y = 0; y < 3;y++){
        if(theirName.length() < 3){
            break;
        }else if(y==0){
         
        System.out.println(count + ". " + "Character: " + firstCharacter(theirName));
        x++;
        count++;
        }else if(y==1){
         
        System.out.println(count + ". " + "Character: " + scndCharacter(theirName));
        x++;
        count++;
        }else if(y==2){
         
        System.out.println(count + ". " + "Character: " + thrdCharacter(theirName));
        x++;
        count++;
        }
         }
    }
     public static String getName(Scanner reader){
        
        String name = reader.nextLine();
                return name;
    }
    
     public static char firstCharacter(String theirName){
          
         char firstLetter = theirName.charAt(0);
      
         
        
        
         return firstLetter;
     }
     public static char scndCharacter(String theirName){
          
         char firstLetter = theirName.charAt(1);
      
         
        
        
         return firstLetter;
     }
     public static char thrdCharacter(String theirName){
          
         char firstLetter = theirName.charAt(2);
      
         
        
        
         return firstLetter;
     }
}

