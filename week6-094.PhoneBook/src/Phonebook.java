/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */
import java.util.ArrayList;
public class Phonebook {
    private ArrayList<Person> phonebook;
    
    public Phonebook(){
        this.phonebook = new ArrayList<Person>();
    }
    
    public void add(String name, String phoneNumber){
        
        Person nOne = new Person(name, phoneNumber);
        
        this.phonebook.add(nOne);
    }
    
    public void printAll(){
        for(int i = 0; i < this.phonebook.size(); i++){
            System.out.println(this.phonebook.get(i));
        }
    }
    
    public String searchNumber(String name){
        for(Person p : this.phonebook){
            if(p.getName().equals(name)){
                return p.getNumber();
            }
        }
        return "number not known";
    }
    
}
