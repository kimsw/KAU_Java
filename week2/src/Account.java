
public abstract class Account implements Valuable {
	private double balance;
	
	public Account (double balance){
		this.balance=balance;
	}
	
	protected void setBalance(double balance){
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
	
	public void debit(double debitAmount) throws Exception{
		if(debitAmount > 0){
			balance -= debitAmount;
		}
		else
			System.out.print("error!!");
	}
	
	public abstract void passTime(int month);
	public abstract void passTime();
	public abstract double getWithdrawableAccount();
}
