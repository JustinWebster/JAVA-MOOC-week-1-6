
/**
 *
 * @author justin
 */
public class LyyraCard {
    private double balance;
    
   
    public LyyraCard(double balanceAtStart){
         balance = balanceAtStart;
    }
    @Override
    public String toString(){
        return "The card has "+balance+" Euros";
    }
    public void payEconomical(){
        if(this.balance < 2.50){
            
        }else if(this.balance >= 2.50){
        this.balance = this.balance - 2.50;
        }
    }
    public void payGourmet(){
        if(this.balance < 4.00){
            
        }else if(this.balance>= 4.00){
        this.balance = this.balance - 4.00;
        }
    }
    public void loadMoney(double amount){
        if(amount < 0){
            
        }else{
        this.balance += amount;
        if(this.balance > 150.00){
            this.balance = 150.00;
        }
    }
    }
}