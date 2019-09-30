import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first nymber:");
        int numOne = Integer.parseInt(reader.nextLine());
        System.out.print("Type the second number:");
        int numTwo = Integer.parseInt(reader.nextLine());
        
        if(numOne>numTwo){
            System.out.println(numOne);
        }else if(numOne==numTwo){
                System.out.println("The numbers are equal!");
        }else{
            System.out.println(numTwo);
        }
      
    }
}
