/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */


public class Bird {
    private String name;
    private String latinName;
    private int timesSeen;
    
    public Bird(String name, String latin){
        this.name = name;
        this.latinName = latin;
        this.timesSeen = 0;
    }
    
    @Override
    public String toString(){
        return this.name + " ("+ this.latinName+ ") "+ this.timesSeen + "observations";
    }
    public String getName(){
        return this.name;
    }
    
    public void setSeen(int a){
        this.timesSeen += a;
    }
 
}
