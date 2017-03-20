
public class Account {
	private double balance;
	
	public void setBalance(double balance){
		this.balance=balance;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void credit(double creditAmount){
		if(creditAmount > 0)
			balance += creditAmount;
		else
			System.out.print("error!!");
	}
	
	public void debit(double debitAmount){
		if(debitAmount > 0)
			balance -= debitAmount;
		else
			System.out.print("error!!");
	}
	
}
