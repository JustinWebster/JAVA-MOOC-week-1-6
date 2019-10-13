
public class Accounts {

    public static void main(String[] args) {
        Account mattAcc = new Account("Matt's account",1000.00);
        Account myAcc = new Account("My account",0.00);
        mattAcc.withdrawal(100.00);
        myAcc.deposit(100.0);
        System.out.println(mattAcc);
        System.out.println(myAcc);
        
        // Code in Account.Java should not be touched!
        // write your code here
    }

}
