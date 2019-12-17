
import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    BirdBook bookOfBirds = new BirdBook();
    Scanner reader = new Scanner(System.in);
    String name;
    String latinName;
        String control;
        while(true){
            System.out.println("Do what?");
            control = reader.nextLine().trim();
            if(control.equalsIgnoreCase("quit")){
                break;
            }
            if(control.equalsIgnoreCase("add")){
                System.out.print("Name: ");
                name = reader.nextLine();
                System.out.println();
                System.out.print("Latin Name: ");
                latinName = reader.nextLine();
                bookOfBirds.add(name, latinName);
            }
            if(control.equalsIgnoreCase("observation")){
                System.out.print("What was observed:? ");
                name = reader.nextLine();
                bookOfBirds.observation(name);
                bookOfBirds.show(name);
            }
            if(control.equalsIgnoreCase("statistics")){
                bookOfBirds.statistics();
            }
            if(control.equalsIgnoreCase("show")){
                System.out.println("Show what?");
                name = reader.nextLine();
                bookOfBirds.show(name);
            }
            
            
            
        
        }
    }

}
