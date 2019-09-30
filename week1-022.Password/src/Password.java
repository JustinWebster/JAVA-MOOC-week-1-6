
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        while(true){
        System.out.print("Type the password:");
        String passEntered = reader.nextLine();
        if(passEntered.equals(password)){
            System.out.println("Right!");
            break;
        }else{
            System.out.println("Wrong!");
        }
        // Write your code here
    }
        System.out.println("Ha, there is no secret! or is there?");
}
}
