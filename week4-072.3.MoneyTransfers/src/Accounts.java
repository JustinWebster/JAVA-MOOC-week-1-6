
public class Accounts {
public static void transfer(Account from, Account to, double howMuch){
    
    from.withdrawal(howMuch);
    to.deposit(howMuch);
}
    public static void main(String[] args) {
        Account a = new Account("Account A",100.00);
        Account b = new Account("Account B",0.00);
        Account c = new Account("Account C",0.00);
        
        transfer(a,b,50.0);
        transfer(b,c,25.0);
    }


}
