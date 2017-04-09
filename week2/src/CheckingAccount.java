
public class CheckingAccount extends Account {
	private double credit_limit, interest, loan_interest;
	
	
	public CheckingAccount(double balance, double credit_limit, double interest, double loan_interest){
		super(balance);
		this.credit_limit = credit_limit;
		this.interest = interest;
		this.loan_interest = loan_interest;
		
	}
	
	@Override
	public void debit(double balance) throws Exception{
		if(balance < 0)
			throw new Exception("음수입력!");
		else if(getBalance()-balance>=(-1*credit_limit)){
			setBalance(getBalance()-balance);
		}
		else
			throw new Exception("Debit amount exceeded account balance.");
	}
	
	public void passTime(int month){
		if(getBalance()>0)
			setBalance(getBalance() * (1+interest)*month);
		else if(getBalance()<0)
			setBalance(getBalance() * (1+loan_interest)*month);
	}
	
	public void passTime(){
		if(getBalance()>=0)
			setBalance(getBalance() * (1+interest));
		else
			setBalance(getBalance() * (1+loan_interest));
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
	public double estimateValue(int month){
		if(getBalance()>0)
			return (getBalance() * (1+interest*month));
		else
			return (getBalance() * (1+loan_interest*month));
	}
	
	@Override
	public double estimateValue() {
		if(getBalance()>=0)
			return (getBalance() * (1+interest));
		else
			return (getBalance()*(1+loan_interest));
	}
	
	@Override
	public String toString(){
		return String.format( "CheckingAccount_Balance: %.2f", getBalance());
	}
	
}
