
public class Printing {

    public static void printStars(int amount) {
        // 39.1
       
        for (int i = 0; i <= amount; i++) {
            if(i == amount){
                System.out.println("");
                break;
            }else{
            
            System.out.print("*");
            }
        }
        
        
        
    }

    public static void printSquare(int sideSize) {
        for (int a = 0; a < sideSize; a++) {
            printStars(sideSize);
            
        }
        // 39.2
    }

    public static void printRectangle(int width, int height) {

        for (int c = 0; c < height; c++) {

            printStars(width);
            
        }

        // 39.3
    }

    public static void printTriangle(int size) {
        for(int b = 1; b<=size;b++){
            printStars(b);
            
        }        
// 39.4
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct
        
        printStars(5);
        
        printStars(3);
        
        printStars(9);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
