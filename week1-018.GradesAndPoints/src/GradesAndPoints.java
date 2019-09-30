
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a the points [0-60]:");
        int theirMark = Integer.parseInt(reader.nextLine());
           
        if(theirMark<30){
                    System.out.println("Grade: failed");
        }else if(theirMark>29 && theirMark<35){
                        System.out.println("Grade: 1");
        }else if(theirMark>34 && theirMark<40){
                        System.out.println("Grade: 2");
        }else if(theirMark>39 && theirMark<45){
                        System.out.println("Grade: 3");
        }else if(theirMark>44 && theirMark<50){
                        System.out.println("Grade: 4");
        }else{
            System.out.println("Grade: 5");
        }
        
    }
}
        
        
        
        
        
    

