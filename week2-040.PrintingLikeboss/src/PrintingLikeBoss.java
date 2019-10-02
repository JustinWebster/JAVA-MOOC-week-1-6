public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
           for (int i = 0; i <= amount; i++) {
            if(i == amount){
                System.out.println("");
                break;
            }else{
            
            System.out.print("*");
            }
        }
    }

    public static void printWhitespaces(int amount) {
        for(int i = 0; i < amount; i++){
            System.out.print(" ");
        }
        // 40.1
    }

    public static void printTriangle(int size) {
        for (int a = 1; a <= size; a++){
            
            
                
                printWhitespaces(size - a);
                printStars(a);
                
            if(a > size){
                break;
            }
            
        }
        // 40.2
    }

    public static void xmasTree(int height) {
          for (int a = 1; a <= height+2; a++){
              if(a == 1){
                printWhitespaces(height-a);
                printStars(a);
              }else if(a > 1 && a <= height){
                  printWhitespaces(height-a);
                printStars((1*a)+(a-1));
                   }if(a > height){
                  printWhitespaces(height-2);
                          printStars(3);   
             }
         
             
              
          }
        // 40.3
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);        
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
