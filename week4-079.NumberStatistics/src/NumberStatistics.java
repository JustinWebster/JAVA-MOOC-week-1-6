


public class NumberStatistics {

    private int amountOfNumbers;
    private int sum;
    

    public NumberStatistics() {

        this.sum = 0;
        this.amountOfNumbers = 0;

    }

    public void addNumber(int x) {
        
        this.sum += x;

        amountOfNumbers++;

    }



    public int amountOfNumbers() {
        System.out.print("Numbers in list: ");
        return this.amountOfNumbers;

    }
    
    public int sum() {
        int ans = this.sum;
        return ans;
    }
    
    public double average(){
        if(sum()== 0){
            return 0;
        }
        
        double av = (sum()*1.0)/(amountOfNumbers*1.0);
        
        return av;
    }

}
//method for sumOfEven
/*  if(x % 2 == 0){
             this.sum+=x;
         }*/
