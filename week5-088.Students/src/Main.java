
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        
         String search;
         String name;
         String studentNumber;
         System.out.print("name: ");
         name = reader.nextLine();
         System.out.print("studentnumber: ");
         studentNumber = reader.nextLine();
         list.add(new Student(name, studentNumber));
         while(true){
             
            System.out.print("name: ");
            name = reader.nextLine();
            if(name.isEmpty()){
                 break;
             }
            System.out.print("studentnumber: ");
            studentNumber = reader.nextLine();
            list.add(new Student(name, studentNumber));
         }
         
         System.out.println(list);
         
         System.out.println("");
         System.out.println("Give search term: ");
         search = reader.nextLine();
        for(Student p : list){
            if(p.getName().contains(search)){
                System.out.println("Result:");
                System.out.println(p);
            }
        }
        
       
       
    }
}
