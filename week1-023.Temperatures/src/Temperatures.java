
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
     while(true){  
         System.out.print("Enter the temprature:");
        double temp = Double.parseDouble(reader.nextLine());

        if (temp > -30 && temp < 40) {
            
                Graph.addNumber(temp);

            
            
          
            
            
        }else{

            // Graph is used as follows:
            /*  Graph.addNumber(7);
        double value = 13.5;
        Graph.addNumber(value);
        value = 3;
        Graph.addNumber(value);*/
            // Remove or comment out these lines above before trying to run the tests.
        }

    }

}
}
