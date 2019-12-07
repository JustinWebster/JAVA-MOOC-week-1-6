
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }
    
    public Money plus(Money added){
        Money sum = new Money(this.euros+added.euros, this.cents+added.cents);
        return sum;
    }
    
    public boolean less(Money a){
       if(this.euros < a.euros || this.euros == a.euros && this.cents < a.cents){
          
       }else{
           return false;
       }
       return true;
      
    }
    
    public Money minus(Money toMinus){
        int eur = this.euros - toMinus.euros;
        int cent = this.cents - toMinus.cents;
        if(this.euros < toMinus.euros){
            eur = 0;
            cent = 0;
        }
        if(cent < 0){
            cent = 100 - Math.abs(cent);
            eur -=1;
        }
        if(eur < 0){
            eur = 0;
        }
        
        Money difference = new Money(eur,cent );
        return difference;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
