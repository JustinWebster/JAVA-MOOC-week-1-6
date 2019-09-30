
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //2*pi*r
        System.out.print("Enter the Radius:");
        double radius = Double.parseDouble(reader.nextLine());
        double answer = 2*Math.PI*radius;
        System.out.println("Circumference of the circle: "+answer);
                
        // Program your solution here 
    }
}
