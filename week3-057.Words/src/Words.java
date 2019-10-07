import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String beanCollecter;
        while(true){
            
        System.out.print("Type a word: ");
        beanCollecter = reader.nextLine();
        if(beanCollecter.isEmpty()){
            System.out.println(words);
            break;
        }else{
            words.add(beanCollecter);
        }
        }
    }
}
