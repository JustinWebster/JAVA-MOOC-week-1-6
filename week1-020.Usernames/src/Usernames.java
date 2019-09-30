
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String userAlex = "alex";
        String alexPW = "mightyducks";
        String userEmily = "emily";
        String emilyPW = "cat";
        System.out.print("Type in your username:");
        String usernameEntered = reader.nextLine();
        if(usernameEntered.equals(userAlex) || usernameEntered.equals(userEmily)){
                System.out.print("Type your password:");
                String passEntered = reader.nextLine();
                if(passEntered.equals(alexPW) && usernameEntered.equals(userAlex) || passEntered.equals(emilyPW) && usernameEntered.equals(userEmily)){
                    System.out.println("You are now logged into the system!");
                }else{
            System.out.println("Your username or password was invalid!");
        }
        }else{System.out.println("Your username or password was invalid!");}
    }
}
//else{System.out.println("Not yet registered!");}