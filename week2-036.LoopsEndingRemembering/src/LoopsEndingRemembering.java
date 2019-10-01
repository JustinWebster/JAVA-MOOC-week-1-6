import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
            System.out.println("Type numbers:");
            int num = Integer.parseInt(reader.nextLine());
            int x = 0;
            int counter = 1;
            double average = 0.0;
            int even = 0;
            int odd = 0;
            while(true){
                
                if(num == -1){
                    average = (x*1.0)/(counter*1.0);
                    System.out.println("Thank you and see you later!");
                    System.out.println("The sum is " + x);
                    System.out.println("How many numbers: " + counter);
                    System.out.println("Average: " + average);
                    System.out.println("Even: " + even);
                    System.out.println("Odd: " + odd);
                    break;
                }else if(num % 2 == 0){
                    even++;
                }else{
                    odd++;
                }
                x +=num;
                
                num = Integer.parseInt(reader.nextLine());
                if(num != -1){
                    counter++;
                    
                    
                    
                }
                
            }
          
    }
}
