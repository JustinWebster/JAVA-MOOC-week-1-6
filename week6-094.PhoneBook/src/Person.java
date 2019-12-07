/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */

public class Person {
    private String name;
    private String cellNum;
    
    public Person(String name,String cellNum){
        this(name);
        this.cellNum = cellNum;
    }
    
    public Person (String name){
        this.name = name;
        this.cellNum = "";
    }
    
    
    public String getName(){
        return this.name;
    }
    
    public String getNumber(){
        return this.cellNum;
    }
    
    public void changeNumber(String newNum){
        this.cellNum = newNum;
    }
    
    public String toString(){
        return this.name + "  number: "+ this.cellNum;
    }
    
  
    
    
}
