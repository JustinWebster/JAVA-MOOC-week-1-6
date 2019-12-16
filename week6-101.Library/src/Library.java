
import java.util.ArrayList;

/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */

public class Library {
    private ArrayList<Book> books;
    
    public Library(){
         books = new ArrayList<Book>();
    }
    
    public void addBook(Book name){
        this.books.add(name);
    }
    
    public void printBooks(){
        for(int i = 0; i < this.books.size();i++){
        System.out.println(this.books.get(i));
        }
    }
    
    public  ArrayList<Book> searchByTitle(String titleToSearch){
       
        ArrayList<Book> found = new ArrayList<Book>();
        
        for(Book p : this.books){
            if(StringUtils.included(p.title(), titleToSearch)){
                found.add(p);
            }
         }

        return found;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher){
        
            ArrayList<Book> found = new ArrayList<Book>();
        
        for(Book p : this.books){
            if(StringUtils.included(p.publisher(), publisher)){
                found.add(p);
            }
         }

        return found;
    }
    
    public ArrayList<Book> searchByYear(int year){
            ArrayList<Book> found = new ArrayList<Book>();
        
        for(Book p : this.books){
            if(p.year() == year){
                found.add(p);
            }
         }

        return found;
    }
    
}
