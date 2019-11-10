
/**
 *
 * @author justin
 */
public class Counter {
private int startingValue;
private boolean check;
    public Counter(int number, boolean check) {
        this.startingValue = number;
        this.check = check;
        
    }
    public Counter(int number){
        this(number,false);
    }
    public Counter(boolean check){
        this(0,check);
      
    }
    public Counter(){
       this(0,false);
    }
    
    public int value(){
        return this.startingValue;
    }
    public void increase(){
        increase(1);
    }
    public void decrease(){
        if(this.check == false){
        decrease(1);
        }else if(this.check == true && this.startingValue > 0){
            decrease(1);
        }
    }
    public void increase(int num){
        
        if(num > -1){
         this.startingValue += num;
        }
    }
     public void decrease(int num){
        if(this.startingValue - num < 0 && this.check == true){
            num += this.startingValue - num;
        }
  for(int i =0;i<num;i++){
         if(this.check == true && num > -1){
         this.startingValue--;
         }else if(this.check == false && num > -1){
             this.startingValue--;
         }
  }
    }

}
