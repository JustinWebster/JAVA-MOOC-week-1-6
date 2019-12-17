
import java.util.ArrayList;

/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */


public class BirdBook {
    private ArrayList<Bird> newBirds;
    
        public BirdBook(){
        this.newBirds = new ArrayList<Bird>();
    
        }
    
        public void add(String name, String latinName){
            
            newBirds.add(new Bird(name,latinName));
        }
        
        public void observation(String name){
            for(Bird p : newBirds){
                if(p.getName().equalsIgnoreCase(name)){
                    p.setSeen(1);
                    
                }
            }
        }
        
        public void show(String name){
            for(Bird p : newBirds){
                if(p.getName().equalsIgnoreCase(name)){
                    System.out.println(p.toString());
                }
            }
        }
        
        public void statistics(){
            for(Bird p : newBirds){
                System.out.println(p.toString());
                
            }
        }
        
}
