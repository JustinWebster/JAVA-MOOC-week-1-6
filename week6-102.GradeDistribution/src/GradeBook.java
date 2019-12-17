
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */
public class GradeBook {

    private ArrayList<Integer> grades;

    public GradeBook() {
        this.grades = new ArrayList<Integer>();
    }

    public void addScores(Scanner reader) {
        System.out.println("Enter the grades:");
        int i = 0;
        while (true) {
            i = Integer.parseInt(reader.nextLine());
            if(i == -1){
                break;
            }
            if (i >= 0 && i < 61) {
                this.grades.add(i);
            }else{
                
            }
        }
    }

    public void distribution() {
        double help = 0;
        System.out.println("Grade distribution:");
        for (int down = 5; down > -1; down--) {
            System.out.print(down + ":");
            for (int gr : this.grades) {
                if (gr > 49 && down == 5) {
                    System.out.print("*");
                    help++;
                }
                if (gr < 50 && gr > 44 && down == 4) {
                    System.out.print("*");
                    help++;
                }
                if (gr < 45 && gr > 39 && down == 3) {
                    System.out.print("*");
                    help++;
                }
                if (gr < 40 && gr > 34 && down == 2) {
                    System.out.print("*");
                    help++;
                }
                if(gr <35 && gr > 29 && down == 1){
                    System.out.print("*");
                    help++;
                }
                if(gr < 30 && down == 0){
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        double passPercent = (help*100) / this.grades.size();
        System.out.println("Acceptance percentage:" + passPercent+"%");
    }

}
