
public class CheckingAccount extends Account{
	private double credit_limit, interest, loan_interest;
	
	
	public CheckingAccount(double balance, double credit_limit, double interest, double loan_interest){
		super(balance);
		this.credit_limit = credit_limit;
		this.interest = interest;
		this.loan_interest = loan_interest;
		
	}
	
	public void deposit(double balance){
		if(getBalance()-balance<(-1*credit_limit))
			System.out.println("Debit amount exceeded account balance.");
		else
			setBalance(getBalance()-balance);
	}
	
	public void passTime(int month){
		if(getBalance()>0)
			setBalance(getBalance() * (1+interest)*month);
		else if(getBalance()<0)
			setBalance(getBalance() * (1+loan_interest)*month);
	}
	
	public boolean isBankrupted(){
		if(getBalance()<(-1*credit_limit))
			return true;
		else
			return false;
	}
	
	public double getWithdrawableAccount(){
		if((getBalance() > (-1)*credit_limit))
			return (getBalance() + credit_limit);
		else
			return 0;
	}
	
	@Override
	public double EstimateValue(int month){
		if(getBalance()>0)
			return (getBalance() * (1+interest*month));
		else
			return (getBalance() * (1+loan_interest*month));
	}
	@Override
	public String toString(){
		return String.format( "CheckingAccount_Balance: %.2f", getBalance());
	}
}
