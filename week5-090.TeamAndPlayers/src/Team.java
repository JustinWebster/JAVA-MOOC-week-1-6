/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */
import java.util.ArrayList;

public class Team {

    private ArrayList<Player> teamPlayers = new ArrayList<Player>();
    private String name;
    private int teamSize = 16;
    
    public Team(String name) {
        this.name = name;
        
    }
    

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player p) {
        if (this.teamPlayers.size() < this.teamSize) {
            this.teamPlayers.add(p);
        }
        

    }

    public void setMaxSize(int maxSize) {

        this.teamSize = maxSize;

    }

    public void printPlayers() {
      for(Player pl : this.teamPlayers){
          System.out.println(pl);
      }
      
    }
    public int goals(){
        int teamGoals = 0;
       for(Player ply : teamPlayers){
           teamGoals += ply.goals();
       } 
        return teamGoals;
    }

    public int size() {
        return this.teamPlayers.size();
    }

}
