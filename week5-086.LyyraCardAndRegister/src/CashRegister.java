
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        
        this.cashInRegister = 1000.00;
    }
    public boolean payEconomical(LyyraCard card) {
        double lunchPriceLyE = 2.50;
        if(card.balance() >= lunchPriceLyE){
            card.pay(lunchPriceLyE);
            this.economicalSold++;
            return true;
        }
       
        return false;
    }
    public double payEconomical(double cashGiven) {
             double lunchPrice = 2.50;
        if(cashGiven >= lunchPrice){
            this.cashInRegister += lunchPrice;
            this.economicalSold++;
            return cashGiven-lunchPrice;
        }
            
        return cashGiven;
    }
    


    public double payGourmet(double cashGiven) {
      double lunchPriceG = 4.00;
      if(cashGiven >= lunchPriceG){
          this.cashInRegister += lunchPriceG;
          this.gourmetSold++;
          return cashGiven - lunchPriceG;
      }
    
        return cashGiven;
    }
    


    public boolean payGourmet(LyyraCard card) {
        double lunchPriceLyG = 4.00;
        if(card.balance() >= lunchPriceLyG){
            card.pay(lunchPriceLyG);
            this.gourmetSold++;
            return true;
        }
        return false;
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum) {
        if(sum > 0){
        card.loadMoney(sum);
        this.cashInRegister += sum;
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
