
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("How old are you? ");
        int ageVer = Integer.parseInt(reader.nextLine());
        if(ageVer >= 0 && ageVer <= 120){
                System.out.println("OK");
        }else{
            System.out.println("Impossible!");
        }

    }
}
