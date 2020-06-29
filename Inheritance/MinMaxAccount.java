package inheritance;

/* 
 * Design a new class MinMaxAccount whose instances can be used in place 
 * of a BankingAccount object but include new behavior of remembering the minimum 
 * and maximum balances ever recorded for the account. 
 * The account's constructor sets the initial balance based on the Startup information. 
 * Assume that only the debit and credit methods change an account's balance. */

public class MinMaxAccount extends BankingAccount {
	
	private int minBalance;
    private int maxBalance;
    
    public MinMaxAccount(Startup start) {
        super(start);
        minBalance = start.startup_getBalance();
        maxBalance = start.startup_getBalance();
    }
    
    public void debit (Debit debit){
    	super.debit(debit);
        int balance = getBalance();
        
        if(balance < minBalance) {
            minBalance = balance;
        } 
        
        if(balance > maxBalance) {
            maxBalance = balance;
         }
    }
    
    public void credit (Credit credit){
    	super.debit(credit);
        int balance = getBalance();
        
        if(balance < minBalance) {
            minBalance = balance;
        } 
        
        if(balance > maxBalance) {
            maxBalance = balance;
         }
    }
    
    public int getMin(){
        return minBalance;
    }
    
    public int getMax() {
    	return maxBalance;
    }

}
