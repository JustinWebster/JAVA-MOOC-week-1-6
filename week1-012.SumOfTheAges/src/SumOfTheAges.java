
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name:");
        String nameOne = reader.nextLine();
        System.out.print("Type your age:");
        int ageOne = Integer.parseInt(reader.nextLine());
                System.out.print("Type your name:");
                String nameTwo = reader.nextLine();
                System.out.print("Type your age:");
                int ageTwo = Integer.parseInt(reader.nextLine());
  int ans = ageOne+ageTwo; 
        System.out.println(nameOne+" and "+nameTwo+" are "+ans+" years old together!");
        
        // Implement your program here
    }
}
