//Methods for tasks involving restaurant menu's
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;
    
    public Menu() {
        this.meals = new ArrayList<String>();
         
    }
    public void addMeal(String newMeal){
        if(meals.contains(newMeal)){
            
        }else{
            meals.add(newMeal);
        }
    }
     public void printMeals(){
         int i = 1;
         while(i<=meals.size()){
             System.out.println(meals.get(i-1));
             i++;
         }
    }
     public void clearMenu(){
         meals.clear();
     }
}
    

