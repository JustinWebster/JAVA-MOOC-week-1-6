/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */
public class Player {
    private String playerName;
    private int totalGoals;
    
     public Player(String name, int goals){
        this(name);
        this.totalGoals = goals;
    }
    public Player(String name){
        this.playerName = name;
    }
   public String getName(){
       return this.playerName;
   }
   public int goals(){
       return this.totalGoals;
   }
   @Override
   public String toString(){
       return this.playerName+", Goals "+this.totalGoals;
   }
    
}
